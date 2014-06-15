package com.susico.enums;

/**
 * <p>Created by Suminda on 09/06/2014.</p>
 */
public enum OrderParamType {
   /**
    * Change according to underlie price changes
    */
   PeggedToUnderlieTo_,
   /**
    * Pegged to bid ask offset
    */
   PeggedMarketTo_,
   /**
    * Pegged to NNBO offset
    */
   PeggedNBBOTo_,
   /**
    * Market to _ for un filled portion
    */
   MarketTo_,
   /**
    * Limit to _ for un filled portion
    */
   LimitTo_,
   /**
    * Market to _ for un filled portion
    */
   MarketAoNTo_,
   /**
    * Limit to _ for un filled portion
    */
   LimitAoNTo_,
   /**
    * Stop limit or stop to _ other type when stop is reached
    */
   StopTo_,
   /**
    * If specific level is touched move to _ order type. E.g. Limit if touched place touch price here and the limit
    * price in the next price level parameter with parameter set to Limit
    */
   TouchTo_,
   /**
    * Trailing Abs
    */
   TrailAbsTo_,
   /**
    * Trailing %
    */
   TrailPctTo_,
   /**
    * MoC to _
    */
   MoCTo_,
   /**
    * LoC to _
    */
   LoCTo_,
   /**
    * MoO to _
    */
   MoOTo_,
   /**
    * LoO to _
    */
   LoOTo_,
   /**
    * FoK to _
    */
   FoKTo_,
   /**
    * IoC to _
    */
   IoCTo_,
   /**
    * Final order in transitional order is market
    */
   Market,
   /**
    * Final order in transitional order is limit
    */
   Limit,
   /**
    * Final order in transitional order is market
    */
   MarketAoN,
   /**
    * Final order in transitional order is limit
    */
   LimitAoN,
   /**
    * Final order in transitional order is MoC
    */
   MoC,
   /**
    * Final order in transitional order is LoC
    */
   LoC,
   /**
    * Final order in transitional order is MoO
    */
   MoO,
   /**
    * Final order in transitional order is LoO
    */
   LoO,
   /**
    * Default
    */
   Default,
}
