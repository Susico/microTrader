package com.susico.disruptor.events.publishers

import com.susico.enums.PriceConvention
import com.susico.enums.QuoteLevel
import com.susico.enums.QuoteSide
import com.susico.event.Quote
import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors
import groovy.util.logging.Log4j2
import it.unimi.dsi.fastutil.objects.Object2ObjectMap
import it.unimi.dsi.lang.MutableString
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 19/06/2014.
 */
@CompileStatic @InheritConstructors @Log4j2
class QuotePublisher extends BasePublisher<Quote> {
   @Override
   void OnQuote(long timeStamp, long id, @NotNull MutableString ticker, QuoteSide side, double price,
                @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
                @NotNull MutableString marketMaker, long rank, double best, double NBBO,
                @NotNull QuoteLevel quoteLevel, @NotNull Object2ObjectMap meta) {
      long sequence = ringBuffer.next()

      try {
         Quote quote = ringBuffer.get(sequence)

         quote.set timeStamp, id, ticker, side, price, priceConvention, size, currency, marketMaker, rank,
                   best,
                   NBBO, quoteLevel, meta
      } catch (e) {
         log.error e
      } finally {
         ringBuffer.publish(sequence)
      }
   }
}
