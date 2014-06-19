package com.susico.enums

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * <P>Created by Suminda on 09/06/2014.</P>
 */
@TypeChecked @CompileStatic
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
