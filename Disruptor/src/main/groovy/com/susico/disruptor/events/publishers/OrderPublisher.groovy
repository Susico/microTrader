package com.susico.disruptor.events.publishers

import com.susico.enums.*
import com.susico.event.Order
import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors
import it.unimi.dsi.fastutil.longs.LongSet
import it.unimi.dsi.fastutil.objects.Object2ObjectMap
import it.unimi.dsi.lang.MutableString
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 19/06/2014.
 */
@CompileStatic @InheritConstructors
class OrderPublisher extends BasePublisher<Order> {
   void OnOrder(long timeStamp, long id, @NotNull OrderAction orderAction, MutableString account,
                MutableString settlingFirm, @NotNull MutableString ticker, @NotNull MutableString exchange,
                @NotNull MutableString orderTypeName, double size, boolean isHidden, long displayQuantity,
                @NotNull OrderTimeInForce timeInForce, long beforeDateParam, long afterDateParam, boolean afterHours,
                boolean isAllOrNone, double minQuantity, boolean isBlock, boolean isSweepToFill,
                @NotNull MutableString currency, @NotNull PriceConvention priceConvention, double priceLimit,
                double priceStop, double offsetAmount, @NotNull OffsetType offsetType,
                @NotNull MutableString referenceTicker, double discretionaryAmount, double NBBOCap,
                boolean eTradeOnly, boolean firmQuoteOnly, boolean disableSmartRouting,
                @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      long sequence = ringBuffer.next()

      try {
         Order order = (Order) ringBuffer.get(sequence)

         order.set timeStamp, id, orderAction, account, settlingFirm, ticker, exchange, orderTypeName, size, isHidden,
                   displayQuantity, timeInForce, beforeDateParam, afterDateParam, afterHours, isAllOrNone, minQuantity,
                   isBlock, isSweepToFill, currency, priceConvention, priceLimit, priceStop, offsetAmount, offsetType,
                   referenceTicker, discretionaryAmount, NBBOCap, eTradeOnly, firmQuoteOnly, disableSmartRouting,
                   contingentOrderAction, contingentOrderIds, tag, meta
      } catch (e) {
         // log.error e
      } finally {
         ringBuffer.publish(sequence)
      }
   }
}
