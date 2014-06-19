package com.susico.disruptor.events.publishers

import com.lmax.disruptor.RingBuffer
import groovy.transform.CompileStatic

/**
 * Created by Suminda on 19/06/2014.
 */
@CompileStatic
abstract class BasePublisher<T> {
   private final RingBuffer<T> ringBuffer

   BasePublisher(RingBuffer<T> ringBuffer) {
      this.ringBuffer = ringBuffer
   }
}
