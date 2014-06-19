package com.susico.disruptor.events.publishers

import com.lmax.disruptor.RingBuffer
import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

/**
 * Created by Suminda on 19/06/2014.
 */
@TypeChecked @CompileStatic
abstract class BasePublisher<T> {
   private final RingBuffer<T> ringBuffer

   BasePublisher(RingBuffer<T> ringBuffer) {
      this.ringBuffer = ringBuffer
   }
}
