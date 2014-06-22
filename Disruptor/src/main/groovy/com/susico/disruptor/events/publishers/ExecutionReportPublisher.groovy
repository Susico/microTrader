package com.susico.disruptor.events.publishers

import com.susico.enums.OrderStatus
import com.susico.event.ExecutionReport
import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 19/06/2014.
 */
@CompileStatic @InheritConstructors
class ExecutionReportPublisher extends BasePublisher<ExecutionReport> {
   void OnExecutionReport(long timeStamp, long orderID, @NotNull OrderStatus status, long size, long filled,
                          long pending) {
      long sequence = ringBuffer.next()

      try {
         ExecutionReport executionReport = (ExecutionReport) ringBuffer.get(sequence)

         executionReport.set timeStamp, orderID, status, size, filled, pending
      } catch (e) {
         // log.error e
      } finally {
         ringBuffer.publish(sequence)
      }
   }
}
