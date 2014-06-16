package com.susico.event;

import com.susico.enums.PriceConvention;
import com.susico.enums.QuoteLevel;
import com.susico.enums.QuoteSide;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.susico.factories.CollectionFactory.getObjectObjectMap;
import static com.susico.factories.MutableStringFactory.getMutableString;

/**
 * Quote event.
 * Created by Suminda on 09/06/2014.
 */
public class Quote extends EventBase {
   @NotNull private final MutableString   ticker          = getMutableString();
   @NotNull private       QuoteSide       side            = QuoteSide.Default;
   @NotNull private       double          price           = Double.NaN;
   @NotNull private PriceConvention priceConvention = PriceConvention.Price;
   @NotNull private       double          size            = Double.NaN; // Defined as double for FX
   @NotNull private final MutableString   currency        = getMutableString();

   @NotNull private final MutableString marketMaker      = getMutableString();
   @NotNull private       long          rankOrderingOrId = -1;
   @NotNull private       double        bestBidOffer     = Double.NaN;
   @NotNull private       double        NBBO             = Double.NaN;
   @NotNull private       QuoteLevel    quoteLevel       = QuoteLevel.Default;

   @NotNull private final Object2ObjectMap meta = getObjectObjectMap();

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString currency, @NotNull MutableString marketMaker, long rank, double best,
                   double NBBO, @NotNull QuoteLevel quoteLevel, @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, currency, marketMaker, rank, best, NBBO,
          quoteLevel, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
                   @NotNull MutableString marketMaker, long rank, double best, double NBBO,
                   @NotNull QuoteLevel quoteLevel, @NotNull Object2ObjectMap meta) {
      setTimeStamp(timeStamp); setTicker(ticker); setSide(side); setPrice(price); setPriceConvention(priceConvention);
      setSize(size); setCurrency(currency); setMarketMaker(marketMaker); setRankOrderingOrId(rank);
      setBestBidOffer(best); setNBBO(NBBO); setQuoteLevel(quoteLevel); setMeta(meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
                   @NotNull MutableString marketMaker, long rank, double best, double NBBO,
                   @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, priceConvention, size, currency, marketMaker, rank, best, NBBO, quoteLevel,
          null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString currency, @NotNull MutableString marketMaker, long rank, double best,
                   double NBBO, @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, currency, marketMaker, rank, best, NBBO,
          quoteLevel, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
                   @NotNull MutableString marketMaker, long rank, @NotNull QuoteLevel quoteLevel,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, priceConvention, size, currency, marketMaker, rank, Double.NaN, Double.NaN,
          quoteLevel, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString currency, @NotNull MutableString marketMaker, long rank,
                   @NotNull QuoteLevel quoteLevel, @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, currency, marketMaker, rank, Double.NaN,
          Double.NaN, quoteLevel, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
                   @NotNull MutableString marketMaker, long rank, @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, priceConvention, size, currency, marketMaker, rank, Double.NaN, Double.NaN,
          quoteLevel, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString currency, @NotNull MutableString marketMaker, long rank,
                   @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, currency, marketMaker, rank, Double.NaN,
          Double.NaN, quoteLevel, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, priceConvention, size, currency, NullString, -1, Double.NaN, Double.NaN,
          QuoteLevel.TopAndBottomOnly, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString currency, @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, currency, NullString, -1, Double.NaN, Double.NaN,
          QuoteLevel.TopAndBottomOnly, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString currency) {
      set(timeStamp, ticker, side, price, priceConvention, size, currency, NullString, -1, Double.NaN, Double.NaN,
          QuoteLevel.TopAndBottomOnly, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString currency) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, currency, NullString, -1, Double.NaN, Double.NaN,
          QuoteLevel.TopAndBottomOnly, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString marketMaker, long rank, double best, double NBBO,
                   @NotNull QuoteLevel quoteLevel, @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, NullString, marketMaker, rank, best, NBBO,
          quoteLevel, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString marketMaker, long rank,
                   double best, double NBBO, @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, priceConvention, size, NullString, marketMaker, rank, best, NBBO, quoteLevel,
          null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString marketMaker, long rank, double best, double NBBO,
                   @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, NullString, marketMaker, rank, best, NBBO,
          quoteLevel, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString marketMaker, long rank,
                   @NotNull QuoteLevel quoteLevel, @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, priceConvention, size, NullString, marketMaker, rank, Double.NaN, Double.NaN,
          quoteLevel, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString marketMaker, long rank, @NotNull QuoteLevel quoteLevel,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, NullString, marketMaker, rank, Double.NaN,
          Double.NaN, quoteLevel, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull MutableString marketMaker, long rank,
                   @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, priceConvention, size, NullString, marketMaker, rank, Double.NaN, Double.NaN,
          quoteLevel, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull MutableString marketMaker, long rank, @NotNull QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, NullString, marketMaker, rank, Double.NaN,
          Double.NaN, quoteLevel, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size, @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, priceConvention, size, NullString, NullString, -1, Double.NaN, Double.NaN,
          QuoteLevel.TopAndBottomOnly, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, NullString, NullString, -1, Double.NaN,
          Double.NaN, QuoteLevel.TopAndBottomOnly, meta);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price,
                   @NotNull PriceConvention priceConvention, double size) {
      set(timeStamp, ticker, side, price, priceConvention, size, NullString, NullString, -1, Double.NaN, Double.NaN,
          QuoteLevel.TopAndBottomOnly, null);
   }

   public void set(long timeStamp, @NotNull MutableString ticker, QuoteSide side, double price, double size) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, NullString, NullString, -1, Double.NaN,
          Double.NaN, QuoteLevel.TopAndBottomOnly, null);
   }


   @NotNull public MutableString getTicker() {
      return ticker;
   }

   public void setTicker(@NotNull MutableString ticker) {
      setStr(this.ticker, ticker);
   }

   @NotNull public QuoteSide getSide() {
      return side;
   }

   public void setSide(@Nullable QuoteSide side) {
      this.side = side;
   }

   @NotNull public MutableString getMarketMaker() {
      return marketMaker;
   }

   public void setMarketMaker(@NotNull MutableString marketMaker) {
      setStr(this.marketMaker, marketMaker);
   }

   @NotNull public double getPrice() {
      return price;
   }

   public void setPrice(@NotNull final double price) {
      this.price = price;
   }

   @NotNull public PriceConvention getPriceConvention() {
      return priceConvention;
   }

   public void setPriceConvention(@NotNull PriceConvention priceConvention) {
      this.priceConvention = priceConvention;
   }

   @NotNull public double getSize() {
      return size;
   }

   public void setSize(@NotNull final double size) {
      this.size = size;
   }

   @NotNull public MutableString getCurrency() {
      return currency;
   }

   public void setCurrency(@NotNull MutableString currency) {
      setStr(this.currency, currency);
   }

   @NotNull public long getRankOrderingOrId() {
      return rankOrderingOrId;
   }

   public void setRankOrderingOrId(long rankOrderingOrId) {
      this.rankOrderingOrId = rankOrderingOrId <= -1 ? -1 : rankOrderingOrId;
   }

   @NotNull public double getBestBidOffer() {
      return bestBidOffer;
   }

   public void setBestBidOffer(@NotNull final double bestBidOffer) {
      this.bestBidOffer = bestBidOffer;
   }

   @NotNull public double getNBBO() {
      return NBBO;
   }

   public void setNBBO(@NotNull final double NBBO) {
      this.NBBO = NBBO;
   }

   @NotNull public QuoteLevel getQuoteLevel() {
      return quoteLevel;
   }

   public void setQuoteLevel(@NotNull QuoteLevel quoteLevel) {
      this.quoteLevel = quoteLevel;
   }

   @NotNull public Object2ObjectMap getMeta() {
      return meta;
   }

   public void setMeta(@NotNull Object2ObjectMap meta) {
      setMap(this.meta, meta);
   }
}
