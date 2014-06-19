package com.susico.disruptor.events.factories

import com.lmax.disruptor.EventFactory
import com.susico.event.Quote
import groovy.transform.*

/**
 * Created by Suminda on 18/06/2014.
 */
@TypeChecked @CompileStatic @AutoExternalize @AutoClone @Canonical
class QuoteEvent extends Quote implements EventFactory<QuoteEvent> {
   @Override
   QuoteEvent newInstance() { this }
}
