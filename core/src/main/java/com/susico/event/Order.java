package com.susico.event;

import com.susico.enums.*;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.susico.factories.CollectionFactory.getLongSet;
import static com.susico.factories.CollectionFactory.getObjectObjectMap;
import static com.susico.factories.MutableStringFactory.getMutableString;

/**
 * Created by Suminda on 09/06/2014.
 */
public class Order extends EventBase {
   @NotNull private       long          id            = 0;
   @NotNull private final MutableString ticker        = getMutableString();
   @NotNull private final MutableString exchange      = getMutableString();
   @NotNull private final MutableString orderTypeName = getMutableString();
   @NotNull private       double        size          = Double.NaN;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private OrderType orderTypeLevel1 = OrderType.Default;
   /** Limit or stop */
   @NotNull private double    priceLevel1     = Double.NaN;
   @NotNull private OrderType orderTypeLevel2 = OrderType.Default;
   /** Limit on StopLimit */
   @NotNull private double    priceLevel2     = Double.NaN;
   @NotNull private OrderType orderTypeLevel3 = OrderType.Default;
   /** For multi stage transitional order types combining market, stop, limit */
   @NotNull private double    priceLevel3     = Double.NaN;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private RelativeOrderTriggerType relativeOrderTriggerType = RelativeOrderTriggerType.Default;
   @NotNull private RelativeOrderAnchorType  relativeOrderAnchorType  = RelativeOrderAnchorType.Default;
   @NotNull private RelativeOrderUpdateMode  relativeOrderUpdateMode  = RelativeOrderUpdateMode.Default;
   /** Trail, touch, peg */
   @NotNull private RelativeParamOffsetType  relativeParamOffsetType  = RelativeParamOffsetType.Default;
   /** % or value offset */
   @NotNull private double                   relativeOrderParam       = Double.NaN;

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private       OrderStatus               contingentOrderTrigger    = OrderStatus.Default;
   @NotNull private       ContingentOrderActionType contingentOrderActionType = ContingentOrderActionType.Default;
   /** ID of linked order */
   @NotNull private final LongSet                   contingentChildOrderIds   = getLongSet();
   /** Trailing % or value, peg offset, etc. */
   @NotNull private final LongSet                   contingentParentOrderIds  = getLongSet();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private       GroupOrderType groupOrderType = GroupOrderType.Default;
   /** Logically group orders */
   @NotNull private final LongSet        groupOrderIds  = getLongSet();
   @NotNull private final MutableString  orderGroupName = getMutableString();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final MutableString tag = getMutableString();

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   @NotNull private final Object2ObjectMap meta = getObjectObjectMap();

   public void set(long timeStamp, long id, @NotNull MutableString ticker, @NotNull MutableString exchange,
                   @NotNull MutableString orderTypeName, double size, @NotNull OrderType orderTypeLevel1,
                   double priceLevel1, @NotNull OrderType orderTypeLevel2, double priceLevel2,
                   @NotNull OrderType orderTypeLevel3, double priceLevel3,
                   @NotNull RelativeOrderTriggerType relativeOrderTriggerType,
                   @NotNull RelativeOrderAnchorType relativeOrderAnchorType,
                   @NotNull RelativeParamOffsetType relativeParamOffsetType, double relativeOrderParam,
                   @NotNull OrderStatus contingentOrderTrigger,
                   @NotNull ContingentOrderActionType contingentOrderActionType,
                   @NotNull LongSet contingentChildOrderIds, @NotNull LongSet contingentParentOrderIds,
                   @NotNull GroupOrderType groupOrderType, @NotNull MutableString orderGroupName,
                   @NotNull LongSet groupOrderIds, @NotNull MutableString tag, @NotNull Object2ObjectMap meta) {
      setTimeStamp(timeStamp); setId(id); setTicker(ticker); setExchange(exchange); setOrderTypeName(orderTypeName);
      setSize(size); setOrderTypeLevel1(orderTypeLevel1); setOrderTypeLevel2(orderTypeLevel2);
      setOrderTypeLevel3(orderTypeLevel3); setPriceLevel1(priceLevel1); setPriceLevel2(priceLevel2);
      setPriceLevel3(priceLevel3); setRelativeOrderParam(relativeOrderParam); setMeta(meta);
   }

   @NotNull public long getTimeStamp() {
      return timeStamp;
   }

   public void setTimeStamp(@NotNull final long timeStamp) {
      this.timeStamp = timeStamp;
   }

   @NotNull public MutableString getTicker() {
      return ticker;
   }

   public void setTicker(@NotNull MutableString ticker) {
      this.ticker.delete(0, this.ticker.length()).append(ticker);
   }

   public void setContingentChildOrderId(long contingentChildOrderIds) {
      setCollection(this.contingentChildOrderIds, contingentChildOrderIds);
   }

   public void setContingentParentOrderId(long contingentParentOrderIds) {
      setCollection(this.contingentParentOrderIds, contingentParentOrderIds);
   }

   public void setGroupOrderId(@NotNull long groupOrderId) {
      setCollection(this.groupOrderIds, groupOrderId);
   }

   @NotNull public MutableString getExchange() {
      return exchange;
   }

   public void setExchange(@NotNull MutableString exchange) {
      setSB(this.exchange, exchange);
   }

   @NotNull public MutableString getOrderTypeName() {
      return orderTypeName;
   }

   public void setOrderTypeName(@NotNull MutableString orderTypeName) {
      setSB(this.orderTypeName, orderTypeName);
   }

   @NotNull public LongSet getContingentChildOrderIds() {
      return contingentChildOrderIds;
   }

   public void setContingentChildOrderIds(@NotNull LongSet contingentChildOrderIds) {
      setCollection(this.contingentChildOrderIds, contingentChildOrderIds);
   }

   @NotNull public LongSet getContingentParentOrderIds() {
      return contingentParentOrderIds;
   }

   public void setContingentParentOrderIds(@NotNull LongSet contingentParentOrderIds) {
      setCollection(this.contingentParentOrderIds, contingentParentOrderIds);
   }

   @NotNull public MutableString getOrderGroupName() {
      return orderGroupName;
   }

   public void setOrderGroupName(@NotNull MutableString orderGroupName) {
      setSB(this.orderGroupName, orderGroupName);
   }

   @NotNull public LongSet getGroupOrderIds() {
      return groupOrderIds;
   }

   public void setGroupOrderIds(@NotNull LongSet groupOrderIds) {
      setCollection(this.groupOrderIds, groupOrderIds);
   }

   @NotNull public MutableString getTag() {
      return tag;
   }

   public void setTag(@NotNull MutableString tag) {
      setSB(this.tag, tag);
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

   @NotNull public OrderType getOrderTypeLevel1() {
      return orderTypeLevel1;
   }

   public void setOrderTypeLevel1(@NotNull OrderType orderTypeLevel1) {
      this.orderTypeLevel1 = orderTypeLevel1;
   }

   public double getPriceLevel1() {
      return priceLevel1;
   }

   public void setPriceLevel1(final double priceLevel1) {
      this.priceLevel1 = priceLevel1;
   }

   @NotNull public OrderType getOrderTypeLevel2() {
      return orderTypeLevel2;
   }

   public void setOrderTypeLevel2(@NotNull OrderType orderTypeLevel2) {
      this.orderTypeLevel2 = orderTypeLevel2;
   }

   public double getPriceLevel2() {
      return priceLevel2;
   }

   public void setPriceLevel2(final double priceLevel2) {
      this.priceLevel2 = priceLevel2;
   }

   @NotNull public OrderType getOrderTypeLevel3() {
      return orderTypeLevel3;
   }

   public void setOrderTypeLevel3(@NotNull OrderType orderTypeLevel3) {
      this.orderTypeLevel3 = orderTypeLevel3;
   }

   public double getPriceLevel3() {
      return priceLevel3;
   }

   public void setPriceLevel3(final double priceLevel3) {
      this.priceLevel3 = priceLevel3;
   }

   @NotNull public RelativeOrderTriggerType getRelativeOrderTriggerType() {
      return relativeOrderTriggerType;
   }

   public void setRelativeOrderTriggerType(@NotNull final RelativeOrderTriggerType relativeOrderTriggerType) {
      this.relativeOrderTriggerType = relativeOrderTriggerType;
   }

   @NotNull public RelativeOrderAnchorType getRelativeOrderAnchorType() {
      return relativeOrderAnchorType;
   }

   public void setRelativeOrderAnchorType(@NotNull final RelativeOrderAnchorType relativeOrderAnchorType) {
      this.relativeOrderAnchorType = relativeOrderAnchorType;
   }

   @NotNull public RelativeParamOffsetType getRelativeParamOffsetType() {
      return relativeParamOffsetType;
   }

   public void setRelativeParamOffsetType(@NotNull final RelativeParamOffsetType relativeParamOffsetType) {
      this.relativeParamOffsetType = relativeParamOffsetType;
   }

   public double getRelativeOrderParam() {
      return relativeOrderParam;
   }

   public void setRelativeOrderParam(final double relativeOrderParam) {
      this.relativeOrderParam = relativeOrderParam;
   }

   @NotNull public OrderStatus getContingentOrderTrigger() {
      return contingentOrderTrigger;
   }

   public void setContingentOrderTrigger(@NotNull OrderStatus contingentOrderTrigger) {
      this.contingentOrderTrigger = contingentOrderTrigger;
   }

   @NotNull public ContingentOrderActionType getContingentOrderActionType() {
      return contingentOrderActionType;
   }

   public void setContingentOrderActionType(@NotNull ContingentOrderActionType contingentOrderActionType) {
      this.contingentOrderActionType = contingentOrderActionType;
   }

   @NotNull public GroupOrderType getGroupOrderType() {
      return groupOrderType;
   }

   public void setGroupOrderType(@Nullable GroupOrderType groupOrderType) {
      this.groupOrderType = groupOrderType;
   }
}
