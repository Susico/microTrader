package com.susico.enums

import groovy.transform.CompileStatic;

/**
 * <P>Created by Suminda on 09/06/2014.</P>
 */
@CompileStatic
public enum PriceConvention {
   /**
    * Price
    */
   Price,
   /**
    * Volatility
    */
         VolatilityDaily,
   /**
    * Volatility
    */
         VolatilityAnnual,
   /**
    * Delta
    */
         Delta,
   /**
    * Yield
    */
         Yield,
   /**
    * Spread
    */
         Spread,
   /**
    * Model price
    */
         Model,
}
