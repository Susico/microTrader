package com.susico.disruptor.events.factories

import com.lmax.disruptor.EventFactory
import com.susico.event.Order
import groovy.transform.AutoClone
import groovy.transform.AutoExternalize
import groovy.transform.Canonical
import groovy.transform.CompileStatic

/**
 * Created by Suminda on 18/06/2014.
 */
@CompileStatic @AutoExternalize @AutoClone @Canonical
class OrderEvent extends Order implements EventFactory<OrderEvent> {
   @Override
   OrderEvent newInstance() { this }
}
