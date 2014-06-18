package com.susico.event

import com.susico.enums.OrderStatus
import groovy.transform.AutoClone
import groovy.transform.AutoExternalize
import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 15/06/2014.
 */
@CompileStatic @AutoExternalize @AutoClone @Canonical @Builder(builderStrategy = SimpleStrategy, prefix = "")
class ExecutionReport extends EventBase {
   long orderID = -1
   @NotNull OrderStatus status  = OrderStatus.Default
   long size    = -1
   long filled  = -1
   long pending = -1

   def set(long orderID, @NotNull OrderStatus status, long size, long filled, long pending) {
      this.orderID = orderID
      this.status = status
      this.size = size
      this.filled = filled
      this.pending = pending
   }

   def ExecutionReport reset() {
      this.orderID = -1
      this.status = OrderStatus.Default
      this.size = -1
      this.filled = -1
      this.pending = -1

      this
   }

   void setOrderID(long orderID) {
      this.orderID = orderID < 0 ? -1 : orderID
   }

   void setSize(long size) {
      this.size = size < 0 ? -1 : size
   }

   void setFilled(long filled) {
      this.size = size < 0 ? -1 : size
   }

   void setPending(long pending) {
      this.pending = pending < 0 ? -1 : pending
   }
}
