package com.susico.event;

import com.susico.enums.ContingentOrderAction;
import com.susico.enums.OrderParamType;
import com.susico.enums.OrderTimeInForce;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;

import static com.susico.factories.CollectionFactory.getLongSet;
import static com.susico.factories.CollectionFactory.getObjectObjectMap;
import static com.susico.factories.MutableStringFactory.getMutableString;

/**
 * Created by Suminda on 09/06/2014.
 */
public class Order extends EventBase {
   // NB: @NotNull ofr primitive type is for alignment
   @NotNull private       long             id                   = 0;
   @NotNull private final MutableString    ticker               = getMutableString();
   @NotNull private final MutableString    exchange             = getMutableString();
   @NotNull private final MutableString    orderTypeName        = getMutableString();
   @NotNull private       double           size                 = Double.NaN;
   @NotNull private       OrderTimeInForce timeInForce          = OrderTimeInForce.Default;
   @NotNull private       long             timeInForceDateParam = 0;
   @NotNull private       long             minQuantity          = 0;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final MutableString currency = getMutableString();

   @NotNull private OrderParamType orderParamTypeLevel1 = OrderParamType.Default;
   @NotNull private double         paramLevel1          = Double.NaN;
   @NotNull private OrderParamType orderParamTypeLevel2 = OrderParamType.Default;
   @NotNull private double         paramLevel2          = Double.NaN;
   @NotNull private OrderParamType orderParamTypeLevel3 = OrderParamType.Default;
   @NotNull private double         paramLevel3          = Double.NaN;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private       ContingentOrderAction contingentOrderAction = ContingentOrderAction.Default;
   @NotNull private final LongSet               contingentOrderIds    = getLongSet();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final MutableString tag = getMutableString();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final Object2ObjectMap meta = getObjectObjectMap();

   public void set(long timeStamp, long id, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, @NotNull OrderParamType orderParamTypeLevel1,
                   double priceLevel1, @NotNull OrderParamType orderParamTypeLevel2, double priceLevel2,
                   @NotNull OrderParamType orderParamTypeLevel3, double priceLevel3,
                   @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, ticker, exchange, orderTypeName, size, NullString, orderParamTypeLevel1, priceLevel1,
          orderParamTypeLevel2, priceLevel2, orderParamTypeLevel3, priceLevel3, contingentOrderAction,
          contingentOrderIds, tag, meta);
   }

   public void set(long timeStamp, long id, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, @NotNull MutableString currency,
                   @NotNull OrderParamType orderParamTypeLevel1, double priceLevel1,
                   @NotNull OrderParamType orderParamTypeLevel2, double priceLevel2,
                   @NotNull OrderParamType orderParamTypeLevel3, double priceLevel3,
                   @NotNull ContingentOrderAction contingentOrderAction, @NotNull LongSet contingentOrderIds,
                   @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      setTimeStamp(timeStamp); setId(id); setTicker(ticker); setExchange(exchange); setOrderTypeName(orderTypeName);
      setSize(size); setCurrency(currency); setOrderParamTypeLevel1(orderParamTypeLevel1);
      setOrderParamTypeLevel2(orderParamTypeLevel2); setOrderParamTypeLevel3(orderParamTypeLevel3);
      setParamLevel1(priceLevel1); setParamLevel2(priceLevel2); setParamLevel3(priceLevel3);
      setContingentOrderAction(contingentOrderAction); setContingentOrderIds(contingentOrderIds); setTag(tag);
      setMeta(meta);
   }

   public void set(long timeStamp, long id, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, @NotNull MutableString currency,
                   @NotNull OrderParamType orderParamTypeLevel1, double priceLevel1,
                   @NotNull OrderParamType orderParamTypeLevel2, double priceLevel2,
                   @NotNull OrderParamType orderParamTypeLevel3, double priceLevel3, @NotNull MutableString tag,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, ticker, exchange, orderTypeName, size, currency, orderParamTypeLevel1, priceLevel1,
          orderParamTypeLevel2, priceLevel2, orderParamTypeLevel3, priceLevel3, ContingentOrderAction.Default,
          EmptyLongSet, tag, meta);
   }

   public void set(long timeStamp, long id, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, @NotNull OrderParamType orderParamTypeLevel1,
                   double priceLevel1, @NotNull OrderParamType orderParamTypeLevel2, double priceLevel2,
                   @NotNull OrderParamType orderParamTypeLevel3, double priceLevel3, @NotNull MutableString tag,
                   @NotNull Object2ObjectMap meta) {
      set(timeStamp, id, ticker, exchange, orderTypeName, size, NullString, orderParamTypeLevel1, priceLevel1,
          orderParamTypeLevel2, priceLevel2, orderParamTypeLevel3, priceLevel3, ContingentOrderAction.Default,
          EmptyLongSet, tag, meta);
   }

   @NotNull public MutableString getTicker() {
      return ticker;
   }

   public void setTicker(@NotNull MutableString ticker) {
      this.ticker.delete(0, this.ticker.length()).append(ticker);
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

   @NotNull public long getTimeInForceDateParam() {
      return timeInForceDateParam;
   }

   public void setTimeInForceDateParam(@NotNull final long timeInForceDateParam) {
      this.timeInForceDateParam = timeInForceDateParam;
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

   @NotNull public OrderParamType getOrderParamTypeLevel1() {
      return orderParamTypeLevel1;
   }

   public void setOrderParamTypeLevel1(@NotNull OrderParamType orderParamTypeLevel1) {
      this.orderParamTypeLevel1 = orderParamTypeLevel1;
   }

   public double getParamLevel1() {
      return paramLevel1;
   }

   public void setParamLevel1(final double paramLevel1) {
      this.paramLevel1 = paramLevel1;
   }

   @NotNull public OrderParamType getOrderParamTypeLevel2() {
      return orderParamTypeLevel2;
   }

   public void setOrderParamTypeLevel2(@NotNull OrderParamType orderParamTypeLevel2) {
      this.orderParamTypeLevel2 = orderParamTypeLevel2;
   }

   public double getParamLevel2() {
      return paramLevel2;
   }

   public void setParamLevel2(final double paramLevel2) {
      this.paramLevel2 = paramLevel2;
   }

   @NotNull public OrderParamType getOrderParamTypeLevel3() {
      return orderParamTypeLevel3;
   }

   public void setOrderParamTypeLevel3(@NotNull OrderParamType orderParamTypeLevel3) {
      this.orderParamTypeLevel3 = orderParamTypeLevel3;
   }

   public double getParamLevel3() {
      return paramLevel3;
   }

   public void setParamLevel3(final double paramLevel3) {
      this.paramLevel3 = paramLevel3;
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
}
