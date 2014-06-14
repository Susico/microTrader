package com.susico.event;

import com.susico.enums.*;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

import java.util.Map;
import java.util.Set;

import static com.susico.factories.CollectionFactory.getLongSet;
import static com.susico.factories.CollectionFactory.getObjectObjectMap;

public class Order extends EventBase {
   private final StringBuilder             ticker                    = new StringBuilder();
   private final StringBuilder             exchange                  = new StringBuilder();
   private final StringBuilder             orderTypeName             = new StringBuilder();
   private final LongSet                   contingentChildOrderIds   = getLongSet(); // ID of linked order
   private final LongSet                   contingentParentOrderIds  = getLongSet();
   private final StringBuilder             orderGroupName            = new StringBuilder();
   // Logically group orders
   private final Set<Long>                 groupOrderIds             = getLongSet();
   private final StringBuilder             tag                       = new StringBuilder();
   private final Object2ObjectMap          meta                      = getObjectObjectMap();
   private       long                      id                        = 0;
   private       double                    size                      = Double.NaN;
   private       OrderType                 orderTypeLevel1           = OrderType.Default;
   private       double                    priceLevel1               = Double.NaN; // Limit or stop
   private       OrderType                 orderTypeLevel2           = OrderType.Default;
   private       double                    priceLevel2               = Double.NaN; // Limit on stop limit
   private       OrderType                 orderTypeLevel3           = OrderType.Default;
   private       double                    priceLevel3               = Double.NaN;
   // For multi stage transitional order types combining market, stop, limit
   private       DependentOrderType        dependentOrderType        = DependentOrderType.Default;
   private       DependentOrderAnchorType  dependentOrderAnchorType  = DependentOrderAnchorType.Default;
   // Trail, touch, peg
   private       DependentParamOffsetType  dependentParamOffsetType  = DependentParamOffsetType.Default;
   // % or value offset
   private       double                    dependentOrderParam       = Double.NaN;
   // Trailing % or value, peg offset, etc.
   private       OrderStatus               contingentOrderTrigger    = OrderStatus.Default;
   private       ContingentOrderActionType contingentOrderActionType = ContingentOrderActionType.Default;
   private       GroupOrderType            groupOrderType            = GroupOrderType.Default;

   public void set(long id, StringBuilder ticker, StringBuilder exchange, StringBuilder orderTypeName, double size,
                   OrderType orderTypeLevel1, double priceLevel1, OrderType orderTypeLevel2, double priceLevel2,
                   OrderType orderTypeLevel3, double priceLevel3, double dependentOrderParam,
                   OrderStatus contingentOrderTrigger, ContingentOrderActionType contingentOrderActionType,
                   Set<Long> contingentChildOrderIds, Set<Long> contingentParentOrderIds, GroupOrderType groupOrderType,
                   StringBuilder orderGroupName, Set<Long> groupOrderIds, StringBuilder tag, Map<?, ?> meta) {
      this.id = id; setTicker(ticker); setExchange(exchange); setOrderTypeName(orderTypeName); this.size = size;
      setOrderTypeLevel1(orderTypeLevel1); setOrderTypeLevel2(orderTypeLevel2); setOrderTypeLevel3(orderTypeLevel3);
      this.priceLevel1 = priceLevel1; this.priceLevel2 = priceLevel2; this.priceLevel3 = priceLevel3;
      this.dependentOrderParam = dependentOrderParam; setMeta(meta);
   }

   public void setTicker(StringBuilder ticker) {
      this.ticker.delete(0, this.ticker.length()).append(ticker == null ? "" : ticker);
   }

   public void setExchange(StringBuilder exchange) {
      setSB(this.exchange, exchange);
   }

   public void setOrderTypeName(StringBuilder orderTypeName) {
      setSB(this.orderTypeName, orderTypeName);
   }

   public void setOrderTypeLevel1(OrderType orderTypeLevel) {
      this.orderTypeLevel1 = orderTypeLevel == null ? OrderType.Default : orderTypeLevel;
   }

   public void setOrderTypeLevel2(OrderType orderTypeLevel) {
      this.orderTypeLevel2 = orderTypeLevel == null ? OrderType.Default : orderTypeLevel;
   }

   public void setOrderTypeLevel3(OrderType orderTypeLevel) {
      this.orderTypeLevel3 = orderTypeLevel == null ? OrderType.Default : orderTypeLevel;
   }

   public void setMeta(Map<? extends Object, ? extends Object> meta) {
      setMap(this.meta, meta);
   }

   public void setContingentOrderTrigger(OrderStatus contingentOrderTrigger) {
      this.contingentOrderTrigger = contingentOrderTrigger == null ? OrderStatus.Default : contingentOrderTrigger;
   }

   public void setContingentOrderActionType(ContingentOrderActionType contingentOrderActionType) {
      this.contingentOrderActionType =
            contingentOrderActionType == null ? ContingentOrderActionType.Default : contingentOrderActionType;
   }

   public void setOrderGroupName(String orderGroupName) {
      setSB(this.orderGroupName, orderGroupName);
   }

   public void setContingentChildOrderIds(Set<Long> contingentChildOrderIds) {
      setCollection(this.contingentChildOrderIds, contingentChildOrderIds);
   }

   public void setContingentParentOrderIds(Set<Long> contingentParentOrderIds) {
      setCollection(this.contingentParentOrderIds, contingentParentOrderIds);
   }

   public void setContingentChildOrderId(Long contingentChildOrderIds) {
      setCollection(this.contingentChildOrderIds, contingentChildOrderIds);
   }

   public void setContingentParentOrderId(Long contingentParentOrderIds) {
      setCollection(this.contingentParentOrderIds, contingentParentOrderIds);
   }

   public void setGroupOrderType(GroupOrderType groupOrderType) {
      this.groupOrderType = groupOrderType == null ? GroupOrderType.Default : groupOrderType;
   }

   public void setGroupOrderIds(Set<Long> groupOrderIds) {
      setCollection(this.groupOrderIds, groupOrderIds);
   }

   public void setGroupOrderId(Long groupOrderId) {
      setCollection(this.groupOrderIds, groupOrderId);
   }

   public void setTag(String tag) {
      setSB(this.tag, tag);
   }
}
