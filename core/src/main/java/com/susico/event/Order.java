package com.susico.event;

import com.susico.enums.*;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Suminda on 09/06/2014.
 */
public class Order extends EventBase {
   // NB: @NotNull ofr primitive type is for alignment
   @NotNull private       long          id            = 0;
   @NotNull private       OrderAction   orderAction   = OrderAction.Default;
   @NotNull private final MutableString account       = NullMutableString();
   @NotNull private final MutableString settlingFirm  = NullMutableString();
   @NotNull private final MutableString ticker        = NullMutableString();
   @NotNull private final MutableString exchange      = NullMutableString();
   @NotNull private final MutableString orderTypeName = NullMutableString();
   @NotNull private       double        size          = Double.NaN;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private boolean isHidden        = false;
   @NotNull private long    displayQuantity = -1;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private OrderTimeInForce timeInForce     = OrderTimeInForce.Default;
   @NotNull private long             beforeDateParam = 0;
   @NotNull private long             afterDateParam  = 0;
   @NotNull private boolean          isAfterHours    = false;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private boolean isAllOrNone = false;
   @NotNull private long    minQuantity = 0;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private boolean isBlock = false;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final MutableString currency = NullMutableString();

   @NotNull private PriceConvention priceConvention = PriceConvention.Price;

   @NotNull private double     priceLimit   = Double.NaN;
   @NotNull private double     priceStop    = Double.NaN;
   @NotNull private double     offsetAmount = Double.NaN;
   @NotNull private OffsetType offsetType   = OffsetType.Default;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final MutableString referenceTicker = NullMutableString();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private double  discretionaryAmount = Double.NaN;
   @NotNull private double  NBBOCap             = Double.NaN;
   @NotNull private boolean eTradeOnly          = false;
   @NotNull private boolean firmQuoteOnly       = false;
   @NotNull private boolean disableSmartRouting = false;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private       ContingentOrderAction contingentOrderAction = ContingentOrderAction.Default;
   @NotNull private final LongSet               contingentOrderIds    = EmptyLongSet();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final MutableString tag = NullMutableString();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final Object2ObjectMap meta = EmptyObject2ObjectMap();

   public void set(long timeStamp, long id, @NotNull OrderAction orderAction, MutableString account,
                   MutableString settlingFirm, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, boolean isHidden, long displayQuantity,
                   @NotNull OrderTimeInForce timeInForce, long beforeDateParam, long afterDateParam, boolean afterHours,
                   boolean isAllOrNone, long minQuantity, boolean isBlock, @NotNull MutableString currency,
                   @NotNull PriceConvention priceConvention, double priceLimit, double priceStop, double offsetAmount,
                   @NotNull OffsetType offsetType, double discretionaryAmount, double NBBOCap, boolean eTradeOnly,
                   boolean firmQuoteOnly, boolean disableSmartRouting,
                   @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, orderAction, account, settlingFirm, ticker, exchange, orderTypeName, size, isHidden,
          displayQuantity, timeInForce, beforeDateParam, afterDateParam, afterHours, isAllOrNone, minQuantity, isBlock,
          currency, priceConvention, priceLimit, priceStop, offsetAmount, offsetType, NullMutableString(),
          discretionaryAmount, NBBOCap, eTradeOnly, firmQuoteOnly, disableSmartRouting, contingentOrderAction,
          contingentOrderIds, tag, meta);
   }

   public void set(long timeStamp, long id, @NotNull OrderAction orderAction, MutableString account,
                   MutableString settlingFirm, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, boolean isHidden, long displayQuantity,
                   @NotNull OrderTimeInForce timeInForce, long beforeDateParam, long afterDateParam, boolean afterHours,
                   boolean isAllOrNone, long minQuantity, boolean isBlock, @NotNull MutableString currency,
                   @NotNull PriceConvention priceConvention, double priceLimit, double priceStop, double offsetAmount,
                   @NotNull OffsetType offsetType, @NotNull MutableString referenceTicker, double discretionaryAmount,
                   double NBBOCap, boolean eTradeOnly, boolean firmQuoteOnly, boolean disableSmartRouting,
                   @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      setTimeStamp(timeStamp); setId(id); setOrderAction(orderAction); setTicker(ticker); setExchange(exchange);
      setOrderTypeName(orderTypeName); setSize(size); setHidden(isHidden); setDisplayQuantity(displayQuantity);
      setTimeInForce(timeInForce); setBeforeDateParam(beforeDateParam); setAfterDateParam(afterDateParam);
      setAfterHours(afterHours); setAllOrNone(isAllOrNone); setMinQuantity(minQuantity); setBlock(isBlock);
      setCurrency(currency); setPriceConvention(priceConvention); setPriceLimit(priceLimit); setPriceStop(priceStop);
      setOffsetAmount(offsetAmount); setOffsetType(offsetType); setReferenceTicker(referenceTicker);
      setDiscretionaryAmount(discretionaryAmount); setNBBOCap(NBBOCap); seteTradeOnly(eTradeOnly);
      setFirmQuoteOnly(firmQuoteOnly); setDisableSmartRouting(disableSmartRouting);
      setContingentOrderAction(contingentOrderAction); setContingentOrderIds(contingentOrderIds); setTag(tag);
      setMeta(meta);
   }

   public void set(long timeStamp, long id, @NotNull OrderAction orderAction, @NotNull MutableString ticker,
                   @NotNull MutableString exchange, @NotNull MutableString orderTypeName, double size, boolean isHidden,
                   long displayQuantity, @NotNull OrderTimeInForce timeInForce, long beforeDateParam,
                   long afterDateParam, boolean afterHours, boolean isAllOrNone, long minQuantity, boolean isBlock,
                   @NotNull MutableString currency, @NotNull PriceConvention priceConvention, double priceLimit,
                   double priceStop, double offsetAmount, @NotNull OffsetType offsetType, double discretionaryAmount,
                   double NBBOCap, boolean eTradeOnly, boolean firmQuoteOnly, boolean disableSmartRouting,
                   @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, orderAction, NullMutableString(), NullMutableString(), ticker, exchange, orderTypeName, size,
          isHidden, displayQuantity, timeInForce, beforeDateParam, afterDateParam, afterHours, isAllOrNone, minQuantity,
          isBlock, currency, priceConvention, priceLimit, priceStop, offsetAmount, offsetType, NullMutableString(),
          discretionaryAmount, NBBOCap, eTradeOnly, firmQuoteOnly, disableSmartRouting, contingentOrderAction,
          contingentOrderIds, tag, meta);
   }

   public void set(long timeStamp, long id, @NotNull OrderAction orderAction, @NotNull MutableString ticker,
                   @NotNull MutableString exchange, @NotNull MutableString orderTypeName, double size, boolean isHidden,
                   long displayQuantity, @NotNull OrderTimeInForce timeInForce, long beforeDateParam,
                   long afterDateParam, boolean afterHours, boolean isAllOrNone, long minQuantity, boolean isBlock,
                   @NotNull PriceConvention priceConvention, double priceLimit, double priceStop, double offsetAmount,
                   @NotNull OffsetType offsetType, @NotNull MutableString referenceTicker, double discretionaryAmount,
                   double NBBOCap, boolean eTradeOnly, boolean firmQuoteOnly, boolean disableSmartRouting,
                   @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, orderAction, NullMutableString(), NullMutableString(), ticker, exchange, orderTypeName, size,
          isHidden, displayQuantity, timeInForce, beforeDateParam, afterDateParam, afterHours, isAllOrNone, minQuantity,
          isBlock, NullMutableString(), priceConvention, priceLimit, priceStop, offsetAmount, offsetType,
          referenceTicker, discretionaryAmount, NBBOCap, eTradeOnly, firmQuoteOnly, disableSmartRouting,
          contingentOrderAction, contingentOrderIds, tag, meta);
   }

   public void set(long timeStamp, long id, @NotNull OrderAction orderAction, MutableString account,
                   MutableString settlingFirm, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, boolean isHidden, long displayQuantity,
                   @NotNull OrderTimeInForce timeInForce, long beforeDateParam, long afterDateParam, boolean afterHours,
                   boolean isAllOrNone, long minQuantity, boolean isBlock, @NotNull MutableString currency,
                   @NotNull PriceConvention priceConvention, double priceLimit, double priceStop, double offsetAmount,
                   @NotNull OffsetType offsetType, @NotNull MutableString referenceTicker, double discretionaryAmount,
                   double NBBOCap, boolean eTradeOnly, boolean firmQuoteOnly, boolean disableSmartRouting,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, orderAction, account, settlingFirm, ticker, exchange, orderTypeName, size, isHidden,
          displayQuantity, timeInForce, beforeDateParam, afterDateParam, afterHours, isAllOrNone, minQuantity, isBlock,
          currency, priceConvention, priceLimit, priceStop, offsetAmount, offsetType, referenceTicker,
          discretionaryAmount, NBBOCap, eTradeOnly, firmQuoteOnly, disableSmartRouting, ContingentOrderAction.Default,
          EmptyLongSet(), tag, meta);
   }

   public void set(long timeStamp, long id, @NotNull OrderAction orderAction, @NotNull MutableString ticker,
                   @NotNull MutableString exchange, @NotNull MutableString orderTypeName, double size, boolean isHidden,
                   long displayQuantity, @NotNull OrderTimeInForce timeInForce, long beforeDateParam,
                   long afterDateParam, boolean afterHours, boolean isAllOrNone, long minQuantity, boolean isBlock,
                   @NotNull MutableString currency, @NotNull PriceConvention priceConvention, double priceLimit,
                   double priceStop, double offsetAmount, @NotNull OffsetType offsetType,
                   @NotNull MutableString referenceTicker, double discretionaryAmount, double NBBOCap,
                   boolean eTradeOnly, boolean firmQuoteOnly, boolean disableSmartRouting, @NotNull MutableString tag,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, orderAction, NullMutableString(), NullMutableString(), ticker, exchange, orderTypeName, size,
          isHidden, displayQuantity, timeInForce, beforeDateParam, afterDateParam, afterHours, isAllOrNone, minQuantity,
          isBlock, currency, priceConvention, priceLimit, priceStop, offsetAmount, offsetType, referenceTicker,
          discretionaryAmount, NBBOCap, eTradeOnly, firmQuoteOnly, disableSmartRouting, ContingentOrderAction.Default,
          EmptyLongSet(), tag, meta);
   }

   @NotNull public MutableString getTicker() {
      return ticker;
   }

   public void setTicker(@NotNull MutableString ticker) {
      this.ticker.delete(0, this.ticker.length()).append(ticker);
   }

   @NotNull public MutableString getAccount() {
      return account;
   }

   public void setAccount(@NotNull final MutableString account) {
      setStr(this.account, account);
   }

   @NotNull public MutableString getSettlingFirm() {
      return settlingFirm;
   }

   public void setSettlingFirm(@NotNull final MutableString settlingFirm) {
      setStr(this.settlingFirm, settlingFirm);
   }

   @NotNull public boolean isHidden() {
      return isHidden;
   }

   public void setHidden(@NotNull final boolean isHidden) {
      this.isHidden = isHidden;
   }

   @NotNull public long getDisplayQuantity() {
      return displayQuantity;
   }

   public void setDisplayQuantity(@NotNull final long displayQuantity) {
      this.displayQuantity = displayQuantity;
   }

   @NotNull public long getBeforeDateParam() {
      return beforeDateParam;
   }

   public void setBeforeDateParam(@NotNull final long beforeDateParam) {
      this.beforeDateParam = beforeDateParam;
   }

   @NotNull public boolean isAfterHours() {
      return isAfterHours;
   }

   public void setAfterHours(@NotNull final boolean afterHours) {
      this.isAfterHours = afterHours;
   }

   @NotNull public boolean isAllOrNone() {
      return isAllOrNone;
   }

   public void setAllOrNone(@NotNull final boolean isAllOrNone) {
      this.isAllOrNone = isAllOrNone;
   }

   @NotNull public boolean isBlock() {
      return isBlock;
   }

   public void setBlock(@NotNull final boolean isBlock) {
      this.isBlock = isBlock;
   }

   @NotNull public PriceConvention getPriceConvention() {
      return priceConvention;
   }

   public void setPriceConvention(@NotNull final PriceConvention priceConvention) {
      this.priceConvention = priceConvention;
   }

   @NotNull public OffsetType getOffsetType() {
      return offsetType;
   }

   public void setOffsetType(@NotNull final OffsetType offsetType) {
      this.offsetType = offsetType;
   }

   @NotNull public MutableString getReferenceTicker() {
      return referenceTicker;
   }

   public void setReferenceTicker(@NotNull final MutableString referenceTicker) {
      setStr(this.referenceTicker, referenceTicker);
   }

   @NotNull public double getDiscretionaryAmount() {
      return discretionaryAmount;
   }

   public void setDiscretionaryAmount(@NotNull final double discretionaryAmount) {
      this.discretionaryAmount = discretionaryAmount;
   }

   @NotNull public double getNBBOCap() {
      return NBBOCap;
   }

   public void setNBBOCap(@NotNull final double NBBOCap) {
      this.NBBOCap = NBBOCap;
   }

   @NotNull public boolean iseTradeOnly() {
      return eTradeOnly;
   }

   public void seteTradeOnly(@NotNull final boolean eTradeOnly) {
      this.eTradeOnly = eTradeOnly;
   }

   public void setTradeOnly(@NotNull final boolean eTradeOnly) {
      this.eTradeOnly = eTradeOnly;
   }

   public void setContingentOrderId(long contingentOrderIds) {
      setCollection(this.contingentOrderIds, contingentOrderIds);
   }

   @NotNull public MutableString getExchange() {
      return exchange;
   }

   public void setExchange(@NotNull MutableString exchange) {
      setStr(this.exchange, exchange);
   }

   @NotNull public MutableString getOrderTypeName() {
      return orderTypeName;
   }

   public void setOrderTypeName(@NotNull MutableString orderTypeName) {
      setStr(this.orderTypeName, orderTypeName);
   }

   @NotNull public LongSet getContingentOrderIds() {
      return contingentOrderIds;
   }

   public void setContingentOrderIds(@NotNull LongSet contingentOrderIds) {
      setCollection(this.contingentOrderIds, contingentOrderIds);
   }

   @NotNull public MutableString getTag() {
      return tag;
   }

   public void setTag(@NotNull MutableString tag) {
      setStr(this.tag, tag);
   }

   @NotNull public long getAfterDateParam() {
      return afterDateParam;
   }

   public void setAfterDateParam(@NotNull final long afterDateParam) {
      this.afterDateParam = afterDateParam;
   }

   @NotNull public Object2ObjectMap getMeta() {
      return meta;
   }

   public void setMeta(@NotNull Object2ObjectMap meta) {
      setMap(this.meta, meta);
   }

   public long getId() {
      return id;
   }

   public void setId(final long id) {
      this.id = id;
   }

   public double getSize() {
      return size;
   }

   public void setSize(final double size) {
      this.size = size;
   }

   public double getPriceLimit() {
      return priceLimit;
   }

   public void setPriceLimit(final double priceLimit) {
      this.priceLimit = priceLimit;
   }

   public double getPriceStop() {
      return priceStop;
   }

   public void setPriceStop(final double priceStop) {
      this.priceStop = priceStop;
   }

   public double getOffsetAmount() {
      return offsetAmount;
   }

   public void setOffsetAmount(final double offsetAmount) {
      this.offsetAmount = offsetAmount;
   }

   @NotNull public ContingentOrderAction getContingentOrderAction() {
      return contingentOrderAction;
   }

   public void setContingentOrderAction(@NotNull ContingentOrderAction contingentOrderAction) {
      this.contingentOrderAction = contingentOrderAction;
   }

   @NotNull public OrderTimeInForce getTimeInForce() {
      return timeInForce;
   }

   public void setTimeInForce(@NotNull final OrderTimeInForce timeInForce) {
      this.timeInForce = timeInForce;
   }

   @NotNull public long getMinQuantity() {
      return minQuantity;
   }

   public void setMinQuantity(@NotNull final long minQuantity) {
      this.minQuantity = minQuantity;
   }

   @NotNull public MutableString getCurrency() {
      return currency;
   }

   public void setCurrency(@NotNull final MutableString currency) {
      setStr(this.currency, currency);
   }

   @NotNull public boolean isFirmQuoteOnly() {
      return firmQuoteOnly;
   }

   public void setFirmQuoteOnly(@NotNull final boolean firmQuoteOnly) {
      this.firmQuoteOnly = firmQuoteOnly;
   }

   @NotNull public OrderAction getOrderAction() {
      return orderAction;
   }

   public void setOrderAction(@NotNull final OrderAction orderAction) {
      this.orderAction = orderAction;
   }

   @NotNull public boolean isDisableSmartRouting() {
      return disableSmartRouting;
   }

   public void setDisableSmartRouting(@NotNull final boolean disableSmartRouting) {
      this.disableSmartRouting = disableSmartRouting;
   }
}
