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
@CompileStatic @AutoExternalize @AutoClone @Canonical
@Builder(builderStrategy = SimpleStrategy, prefix = "")
class ExecutionReport extends EventBase {
            long        orderID = -1
   @NotNull OrderStatus status  = OrderStatus.Default
            long        size    = -1
            long        filled  = -1
            long        pending = -1

   def set(long timeStamp, long orderID, @NotNull OrderStatus status, long size, long filled, long pending) {
      setTimeStamp(timeStamp)
      setOrderID(orderID)
      setStatus(status)
      setSize(size)
      setFilled(filled)
      setPending(pending)
   }

   def ExecutionReport reset() {
      setTimeStamp(-1)
      setOrderID(-1)
      setStatus(OrderStatus.Default)
      setSize(-1)
      setFilled(-1)
      setPending(-1)

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
