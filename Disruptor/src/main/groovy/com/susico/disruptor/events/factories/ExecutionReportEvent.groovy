package com.susico.disruptor.events.factories

import com.lmax.disruptor.EventFactory
import com.susico.event.ExecutionReport
import groovy.transform.AutoClone
import groovy.transform.AutoExternalize
import groovy.transform.Canonical
import groovy.transform.CompileStatic

/**
 * Created by Suminda on 18/06/2014.
 */
@CompileStatic @AutoExternalize @AutoClone @Canonical
class ExecutionReportEvent extends ExecutionReport
      implements EventFactory<ExecutionReportEvent> {
   @Override
   ExecutionReportEvent newInstance() { this }
}
