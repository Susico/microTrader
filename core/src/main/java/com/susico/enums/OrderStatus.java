package com.susico.enums;

/**
 * Created by Suminda on 11/06/2014.
 */
public enum OrderStatus {
   /**
    * Submitted but not yet filled executing
    */
   Submitted,
   /**
    * Part filled
    */
   PartialFill,
   /**
    * Completed with a fill
    */
   CompletedFilled,
   /**
    * Completed with only a partial fill
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
    * Part rejected
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
