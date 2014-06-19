package com.susico.disruptor.events.handlers

import com.lmax.disruptor.EventHandler
import groovy.transform.CompileStatic

/**
 * Created by Suminda on 18/06/2014.
 */
@CompileStatic
class QuoteHandler implements EventHandler<QuoteHandler> {
   @Override
   void onEvent(final QuoteHandler event, final long sequence, final boolean endOfBatch) throws Exception {

   }
}
