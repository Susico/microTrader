package com.susico.event;

import com.susico.enums.PriceConvention;
import com.susico.enums.QuoteLevel;
import com.susico.enums.QuoteSide;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

import java.util.Map;

import static com.susico.factories.CollectionFactory.getObjectObjectMap;

/**
 * Quote event. <p> <p>Created by Suminda on 09/06/2014.</p>
 */
public class Quote extends EventBase {
   private final StringBuffer     ticker          = new StringBuffer();
   private final StringBuffer     marketMaker     = new StringBuffer();
   private final Object2ObjectMap meta            = getObjectObjectMap();
   private       long             timeStamp       = 0;
   private       QuoteSide        side            = QuoteSide.Default;
   private       double           price           = Double.NaN;
   private       PriceConvention  priceConvention = PriceConvention.Default;
   private       double           size            = Double.NaN; // Defined as double for FX
   private       long             rank            = -1;
   private       double           bestBidOffer    = Double.NaN;
   private       double           NBBO            = Double.NaN;
   private       QuoteLevel       quoteLevel      = QuoteLevel.Default;

   public void set(long timeStamp, String ticker, QuoteSide side, double price, double size, String marketMaker,
                   long rank, double best, double NBBO, QuoteLevel quoteLevel, Map<?, ?> meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, marketMaker, rank, best, NBBO, quoteLevel, meta);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, PriceConvention priceConvention,
                   double size, String marketMaker, long rank, double best, double NBBO, QuoteLevel quoteLevel,
                   Map<?, ?> meta) {
      this.timeStamp = timeStamp; setTicker(ticker); setSide(side); this.price = price;
      setPriceConvention(priceConvention); this.size = size; setMarketMaker(marketMaker); setRank(rank);
      this.bestBidOffer = best; this.NBBO = NBBO; setQuoteLevel(quoteLevel); setMeta(meta);
   }

   public void setTicker(String ticker) {
      setSB(this.ticker, ticker);
   }

   public void setSide(QuoteSide side) {
      this.side = side == null ? QuoteSide.Default : side;
   }

   public void setPriceConvention(PriceConvention priceConvention) {
      this.priceConvention = priceConvention == null ? PriceConvention.Default : priceConvention;
   }

   public void setMarketMaker(String marketMaker) {
      setSB(this.marketMaker, marketMaker);
   }

   public void setRank(long rank) {
      this.rank = rank <= -1 ? -1 : rank;
   }

   public void setQuoteLevel(QuoteLevel quoteLevel) {
      this.quoteLevel = quoteLevel == null ? QuoteLevel.Default : quoteLevel;
   }

   public void setMeta(Map<? extends Object, ? extends Object> meta) {
      setMap(this.meta, meta);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, PriceConvention priceConvention,
                   double size, String marketMaker, long rank, double best, double NBBO, QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, priceConvention, size, marketMaker, rank, best, NBBO, quoteLevel, null);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, double size, String marketMaker,
                   long rank, double best, double NBBO, QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, marketMaker, rank, best, NBBO, quoteLevel, null);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, PriceConvention priceConvention,
                   double size, String marketMaker, long rank, QuoteLevel quoteLevel, Map<?, ?> meta) {
      set(timeStamp, ticker, side, price, priceConvention, size, marketMaker, rank, Double.NaN, Double.NaN, quoteLevel,
          meta);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, double size, String marketMaker,
                   long rank, QuoteLevel quoteLevel, Map<?, ?> meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, marketMaker, rank, Double.NaN, Double.NaN,
          quoteLevel, meta);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, PriceConvention priceConvention,
                   double size, String marketMaker, long rank, QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, priceConvention, size, marketMaker, rank, Double.NaN, Double.NaN, quoteLevel,
          null);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, double size, String marketMaker,
                   long rank, QuoteLevel quoteLevel) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, marketMaker, rank, Double.NaN, Double.NaN,
          quoteLevel, null);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, PriceConvention priceConvention,
                   double size, Map<?, ?> meta) {
      set(timeStamp, ticker, side, price, priceConvention, size, "", -1, Double.NaN, Double.NaN, QuoteLevel.Best, meta);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, double size, Map<?, ?> meta) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, "", -1, Double.NaN, Double.NaN, QuoteLevel.Best,
          meta);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, PriceConvention priceConvention,
                   double size) {
      set(timeStamp, ticker, side, price, priceConvention, size, "", -1, Double.NaN, Double.NaN, QuoteLevel.Best, null);
   }

   public void set(long timeStamp, String ticker, QuoteSide side, double price, double size) {
      set(timeStamp, ticker, side, price, PriceConvention.Price, size, "", -1, Double.NaN, Double.NaN, QuoteLevel.Best,
          null);
   }
}
