package com.susico.event

import com.susico.enums.PriceConvention
import com.susico.enums.QuoteLevel
import com.susico.enums.QuoteSide
import groovy.transform.AutoClone
import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy
import it.unimi.dsi.fastutil.objects.Object2ObjectMap
import it.unimi.dsi.lang.MutableString
import org.jetbrains.annotations.NotNull

import static com.susico.factories.CollectionFactory.EmptyObject2ObjectMap
import static com.susico.factories.CollectionFactory.getObjectObjectMap
import static com.susico.factories.MutableStringFactory.NullMutableString
import static com.susico.factories.MutableStringFactory.getMutableString

/**
 * Quote com.susico.event.
 * Created by Suminda on 09/06/2014.
 */
@CompileStatic @AutoClone @Canonical @Builder(builderStrategy = SimpleStrategy, prefix = "")
class Quote extends EventBase {
            long            id              = -1
   @NotNull MutableString   ticker          = getMutableString()
   @NotNull QuoteSide       side            = QuoteSide.Default
            double          price           = Double.NaN
   @NotNull PriceConvention priceConvention = PriceConvention.Price
            double          size            = Double.NaN // Defined as double for FX
   @NotNull MutableString   currency        = getMutableString()

   @NotNull MutableString marketMaker      = getMutableString()
            long          rankOrderingOrId = -1
            double        bestBidOffer     = Double.NaN
            double        NBBO             = Double.NaN
   @NotNull QuoteLevel    quoteLevel       = QuoteLevel.Default

   @NotNull Object2ObjectMap meta = getObjectObjectMap()

   Quote reset() {
      setTimeStamp(-1)
      setId(-1L)
      setTicker(NullMutableString())
      setSide(QuoteSide.Default)
      setPrice(Double.NaN)
      setPriceConvention(PriceConvention.Price)
      setSize(Double.NaN)
      setCurrency(NullMutableString())
      setMarketMaker(NullMutableString())
      setRankOrderingOrId(-1L)
      setBestBidOffer(Double.NaN)
      setNBBO(Double.NaN)
      setQuoteLevel(QuoteLevel.Default)
      setMeta(EmptyObject2ObjectMap())

      this
   }

   void set(long timeStamp, long id, @NotNull MutableString ticker, QuoteSide side, double price,
            @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
            @NotNull MutableString marketMaker, long rank, double best, double NBBO, @NotNull QuoteLevel quoteLevel,
            @NotNull Object2ObjectMap meta) {
      setTimeStamp(timeStamp)
      setId(-1)
      setTicker(ticker)
      setSide(side)
      setPrice(price)
      setPriceConvention(priceConvention)
      setSize(size)
      setCurrency(currency)
      setMarketMaker(marketMaker)
      setRankOrderingOrId(rank)
      setBestBidOffer(best)
      setNBBO(NBBO)
      setQuoteLevel(quoteLevel)
      setMeta(meta)
   }

   void setId(long id) {
      this.id = id < 0 ? -1 : id
   }

   void setRankOrderingOrId(long rankOrderingOrId) {
      this.rankOrderingOrId = rankOrderingOrId < 0 ? -1 : rankOrderingOrId
   }

   void setTicker(@NotNull MutableString ticker) {
      setStr(this.ticker, ticker)
   }

   void setMarketMaker(@NotNull MutableString marketMaker) {
      setStr(this.marketMaker, marketMaker)
   }

   void setCurrency(@NotNull MutableString currency) {
      setStr(this.currency, currency)
   }

   void setMeta(@NotNull Object2ObjectMap meta) {
      setMap(this.meta, meta)
   }

   Quote ticker(@NotNull MutableString ticker) {
      setStr(this.ticker, ticker)

      this
   }

   Quote marketMaker(@NotNull MutableString marketMaker) {
      setStr(this.marketMaker, marketMaker)

      this
   }

   Quote currency(@NotNull MutableString currency) {
      setStr(this.currency, currency)

      this
   }

   Quote meta(@NotNull Object2ObjectMap meta) {
      setMap(this.meta, meta)

      this
   }
}
