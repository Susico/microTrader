package com.susico.disruptor.events.factories

import com.lmax.disruptor.EventFactory
import com.susico.event.Order
import groovy.transform.*

/**
 * Created by Suminda on 18/06/2014.
 */
@TypeChecked @CompileStatic @AutoExternalize @AutoClone @Canonical
class OrderEvent extends Order implements EventFactory<OrderEvent> {
   @Override
   OrderEvent newInstance() { this }
}
