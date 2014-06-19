package com.susico.disruptor.events.handlers

import com.lmax.disruptor.EventHandler
import groovy.transform.AutoClone
import groovy.transform.AutoExternalize
import groovy.transform.Canonical
import groovy.transform.CompileStatic

/**
 * Created by Suminda on 18/06/2014.
 */
@CompileStatic @AutoExternalize @AutoClone @Canonical
class QuoteHandler implements EventHandler<QuoteHandler> {
   @Override
   void onEvent(final QuoteHandler event, final long sequence, final boolean endOfBatch) throws Exception {

   }
}
