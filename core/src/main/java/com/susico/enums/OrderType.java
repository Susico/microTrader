package com.susico.enums;

/**
 * <p>Created by Suminda on 09/06/2014.</p>
 */
public enum OrderType {
   /**
    * Market
    */
   Market,
   /**
    * Limit
    */
   Limit,
   /**
    * Stop
    */
   Stop,
   /**
    * Offset order (Mainly for Market Close)
    */
   Imbalance,
   /**
    * Relative
    */
   Relative,
   /**
    * Default
    */
   Default,
}
