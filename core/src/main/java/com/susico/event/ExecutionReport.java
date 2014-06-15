package com.susico.event;

import com.susico.enums.OrderStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Suminda on 15/06/2014.
 */
public class ExecutionReport extends EventBase {
   @NotNull private long        orderID = 0;
   @NotNull private OrderStatus status  = OrderStatus.Default;
   @NotNull private long size;
   @NotNull private long filled;
   @NotNull private long pending;

   public void set(long orderID, OrderStatus status, long size, long filled, long pending) {
      setOrderID(orderID); setStatus(status); setSize(size); setFilled(filled); setPending(pending);
   }

   @NotNull public long getOrderID() {
      return orderID;
   }

   public void setOrderID(@NotNull final long orderID) {
      this.orderID = orderID;
   }

   @NotNull public OrderStatus getStatus() {
      return status;
   }

   public void setStatus(@NotNull final OrderStatus status) {
      this.status = status;
   }

   @NotNull public long getSize() {
      return size;
   }

   public void setSize(@NotNull final long size) {
      this.size = size;
   }

   @NotNull public long getFilled() {
      return filled;
   }

   public void setFilled(@NotNull final long filled) {
      this.filled = filled;
   }

   @NotNull public long getPending() {
      return pending;
   }

   public void setPending(@NotNull final long pending) {
      this.pending = pending;
   }
}
