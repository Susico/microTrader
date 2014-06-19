package com.susico.disruptor.events.handlers

import com.lmax.disruptor.EventHandler
import groovy.transform.CompileStatic

/**
 * Created by Suminda on 18/06/2014.
 */
@CompileStatic
class OrderHandler implements EventHandler<OrderHandler> {
   @Override
   void onEvent(final OrderHandler event, final long sequence, final boolean endOfBatch) throws Exception {

   }
}
