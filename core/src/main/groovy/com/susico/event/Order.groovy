package com.susico.event

import com.susico.enums.*
import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy
import it.unimi.dsi.fastutil.longs.LongCollection
import it.unimi.dsi.fastutil.longs.LongSet
import it.unimi.dsi.fastutil.objects.Object2ObjectMap
import it.unimi.dsi.lang.MutableString
import org.jetbrains.annotations.NotNull

import static com.susico.factories.CollectionFactory.*
import static com.susico.factories.MutableStringFactory.NullMutableString
import static com.susico.factories.MutableStringFactory.getMutableString

/**
 * Created by Suminda on 09/06/2014.
 */
@CompileStatic @Canonical @Builder(builderStrategy = SimpleStrategy, prefix = "")
class Order extends EventBase {
   // NB: @NotNull for primitive type is for alignment
            long          id            = -1
   @NotNull OrderAction   orderAction   = OrderAction.Default
   @NotNull MutableString account       = getMutableString()
   @NotNull MutableString settlingFirm  = getMutableString()
   @NotNull MutableString ticker        = getMutableString()
   @NotNull MutableString exchange      = getMutableString()
   @NotNull MutableString orderTypeName = getMutableString()
            double        size          = Double.NaN

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   boolean hidden          = false
   long    displayQuantity = -1

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull OrderTimeInForce timeInForce     = OrderTimeInForce.Default
            long             beforeDateParam = -1
            long             afterDateParam  = -1
            boolean          afterHours      = false

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   boolean allOrNone   = false
   double  minQuantity = Double.NaN

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   boolean block       = false
   boolean sweepToFill = false

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull MutableString currency = getMutableString()

   @NotNull PriceConvention priceConvention = PriceConvention.Price

   double              priceLimit   = Double.NaN
   double              priceStop    = Double.NaN
            double     offsetAmount = Double.NaN
   @NotNull OffsetType offsetType   = OffsetType.Default

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull MutableString referenceTicker = getMutableString()

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   double discretionaryAmount = Double.NaN
   double NBBOCap             = Double.NaN

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   boolean ETradeOnly          = false
   boolean firmQuoteOnly       = false
   boolean disableSmartRouting = false

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull ContingentOrderAction contingentOrderAction = ContingentOrderAction.Default
   @NotNull LongSet               contingentOrderIds    = getLongSet()

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull MutableString tag = getMutableString()

   @NotNull Object2ObjectMap meta = getObjectObjectMap()

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   Order reset() {
      setTimeStamp(-1L)
      setId(-1L)
      setOrderAction(OrderAction.Default)
      setTicker(NullMutableString())
      setExchange(NullMutableString())
      setOrderTypeName(NullMutableString())
      setSize(Double.NaN)
      setHidden(hidden)
      setDisplayQuantity(-1L)
      setTimeInForce(OrderTimeInForce.Default)
      setBeforeDateParam(-1L)
      setAfterDateParam(-1L)
      setAfterHours(false)
      setAllOrNone(false)
      setMinQuantity(Double.NaN)
      setBlock(false)
      setSweepToFill(false)
      setCurrency(NullMutableString())
      setPriceConvention(PriceConvention.Price)
      setPriceLimit(Double.NaN)
      setPriceStop(Double.NaN)
      setOffsetAmount(Double.NaN)
      setOffsetType(OffsetType.Default)
      setReferenceTicker(NullMutableString())
      setDiscretionaryAmount(Double.NaN)
      setNBBOCap(Double.NaN)
      setETradeOnly(false)
      setFirmQuoteOnly(false)
      setDisableSmartRouting(false)
      setContingentOrderAction(ContingentOrderAction.Default)
      setContingentOrderIds(EmptyLongSet())
      setTag(NullMutableString())
      setMeta(EmptyObject2ObjectMap())

      this
   }

   void set(long timeStamp, long id, @NotNull OrderAction orderAction, MutableString account,
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
      setTimeStamp(timeStamp)
      setId(id)
      setOrderAction(orderAction)
      setTicker(ticker)
      setExchange(exchange)
      setOrderTypeName(orderTypeName)
      setSize(size)
      setHidden(isHidden)
      setDisplayQuantity(displayQuantity)
      setTimeInForce(timeInForce)
      setBeforeDateParam(beforeDateParam)
      setAfterDateParam(afterDateParam)
      setAfterHours(afterHours)
      setAllOrNone(isAllOrNone)
      setMinQuantity(minQuantity)
      setBlock(isBlock)
      setSweepToFill(isSweepToFill)
      setCurrency(currency)
      setPriceConvention(priceConvention)
      setPriceLimit(priceLimit)
      setPriceStop(priceStop)
      setOffsetAmount(offsetAmount)
      setOffsetType(offsetType)
      setReferenceTicker(referenceTicker)
      setDiscretionaryAmount(discretionaryAmount)
      setNBBOCap(NBBOCap)
      setETradeOnly(eTradeOnly)
      setFirmQuoteOnly(firmQuoteOnly)
      setDisableSmartRouting(disableSmartRouting)
      setContingentOrderAction(contingentOrderAction)
      setContingentOrderIds(contingentOrderIds)
      setTag(tag)
      setMeta(meta)
   }

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   void setId(long id) {
      this.id = id < 0 ? -1 : id;
   }

   void setTicker(@NotNull MutableString ticker) {
      setStr(this.ticker, ticker)
   }

   Order ticker(@NotNull MutableString ticker) {
      setStr(this.ticker, ticker)

      this
   }

   void setAccount(@NotNull final MutableString account) {
      setStr(this.account, account)
   }

   Order account(@NotNull final MutableString account) {
      setStr(this.account, account)

      this
   }

   void setSettlingFirm(@NotNull final MutableString settlingFirm) {
      setStr(this.settlingFirm, settlingFirm)
   }

   Order settlingFirm(@NotNull final MutableString settlingFirm) {
      setStr(this.settlingFirm, settlingFirm)

      this
   }

   void setDisplayQuantity(@NotNull final long displayQuantity) {
      this.displayQuantity = displayQuantity < 0 ? -1 : displayQuantity
   }

   void setBeforeDateParam(@NotNull final long beforeDateParam) {
      this.beforeDateParam = beforeDateParam < 0 ? -1 : beforeDateParam
   }

   void setAfterDateParam(@NotNull final long afterDateParam) {
      this.afterDateParam = afterDateParam < 0 ? -1 : afterDateParam
   }

   void setReferenceTicker(@NotNull final MutableString referenceTicker) {
      setStr(this.referenceTicker, referenceTicker)
   }

   Order referenceTicker(@NotNull final MutableString referenceTicker) {
      setStr(this.referenceTicker, referenceTicker)

      this
   }

   void setContingentOrderId(long contingentOrderId) {
      setCollection(this.contingentOrderIds, contingentOrderId)
   }

   void setContingentOrderIds(LongCollection contingentOrderIds) {
      setCollection(this.contingentOrderIds, contingentOrderIds)
   }

   Order contingentOrderIds(LongCollection contingentOrderIds) {
      setCollection(this.contingentOrderIds, contingentOrderIds)

      this
   }

   void setExchange(@NotNull MutableString exchange) {
      setStr(this.exchange, exchange)
   }

   Order exchange(@NotNull MutableString exchange) {
      setStr(this.exchange, exchange)

      this
   }

   void setOrderTypeName(@NotNull MutableString orderTypeName) {
      setStr(this.orderTypeName, orderTypeName)
   }

   Order orderTypeName(@NotNull MutableString orderTypeName) {
      setStr(this.orderTypeName, orderTypeName)

      this
   }

   void setContingentOrderIds(@NotNull LongSet contingentOrderIds) {
      setCollection(this.contingentOrderIds, contingentOrderIds)
   }

   Order contingentOrderIds(@NotNull LongSet contingentOrderIds) {
      setCollection(this.contingentOrderIds, contingentOrderIds)

      this
   }

   void setTag(@NotNull MutableString tag) {
      setStr(this.tag, tag)
   }

   Order tag(@NotNull MutableString tag) {
      setStr(this.tag, tag)

      this
   }

   void setMeta(@NotNull Object2ObjectMap meta) {
      setMap(this.meta, meta)
   }

   Order meta(@NotNull Object2ObjectMap meta) {
      setMap(this.meta, meta)

      this
   }

   void setCurrency(@NotNull final MutableString currency) {
      setStr(this.currency, currency)
   }

   Order currency(@NotNull final MutableString currency) {
      setStr(this.currency, currency)

      this
   }
}
