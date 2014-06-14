package com.susico.enums;

/**
 * Created by Suminda on 10/06/2014.
 */
public enum DependentOrderAnchorType {
   /**
    * Follows default price
    */
   Market,
   /**
    * Use point in time default price
    */
   MarketSnapShot,
   /**
    * Trade price
    */
   TradePrice,
   /**
    * Point in time trade price
    */
   TradePriceSnapShot,
   /**
    * Mid Price
    */
   Mid,
   /**
    * Point in time Mid Price
    */
   MidSnapShot,
   /**
    * Bid Price
    */
   Bid,
   /**
    * Point in time Bid Price
    */
   BidSnapshot,
   /**
    * Ask Price
    */
   Ask,
   /**
    * Point in Time Ask Price
    */
   AskSnapshot,
   /**
    * Default type
    */
   Default,
}
