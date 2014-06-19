package com.susico.disruptor.events.publishers

import com.susico.enums.OrderStatus
import com.susico.event.ExecutionReport
import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors
import groovy.transform.TypeChecked
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 19/06/2014.
 */
@TypeChecked @CompileStatic @InheritConstructors
class ExecutionReportPublisher extends BasePublisher<ExecutionReport> {
   @Override
   void OnExecutionReport(long timeStamp, long orderID, @NotNull OrderStatus status, long size, long filled,
                          long pending) {
      long sequence = ringBuffer.next()

      try {
         ExecutionReport executionReport = ringBuffer.get(sequence)

         executionReport.set timeStamp, orderID, status, size, filled, pending
      } finally {
         ringBuffer.publish(sequence)
      }
   }
}
