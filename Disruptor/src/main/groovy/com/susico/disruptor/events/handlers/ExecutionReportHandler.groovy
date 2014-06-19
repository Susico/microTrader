package com.susico.disruptor.events.handlers

import com.lmax.disruptor.EventHandler
import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

/**
 * Created by Suminda on 18/06/2014.
 */
@TypeChecked @CompileStatic
class ExecutionReportHandler implements EventHandler<ExecutionReportHandler> {
   @Override
   void onEvent(final ExecutionReportHandler event, final long sequence, final boolean endOfBatch) throws Exception {

   }
}
