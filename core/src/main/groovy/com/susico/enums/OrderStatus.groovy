package com.susico.enums

import groovy.transform.CompileStatic

/**
 * Created by Suminda on 11/06/2014.
 */
@CompileStatic
public enum OrderStatus {
   /**
    * Submitted but not yet filled executing
    */
   Submitted,
   /**
    * Part filled and executing. Even if cancelled or rejected this should be called for working orders. Final can be
    * Competed*, Rejected*, and Cancelled*
    */
         PartialFill,
   /**
    * Completed with a fill
    */
         CompletedFilled,
   /**
    * Completed with only a partial fill due to TIF
    */
         CompletedPartialFill,
   /**
    * TIF expires with no fill
    */
         CompletedNotFilled,
   /**
    * Rejected by broker or exchange
    */
         RejectedNotFilled,
   /**
    * Part rejected with partial fill
    */
         RejectedPartialFill,
   /**
    * Cancelled before execution
    */
         CancelledNoFilled,
   /**
    * Cancelled after partial fill
    */
         CancelledPartialFill,
   /**
    * Default
    */
         Default,
}
