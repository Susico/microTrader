package com.susico.enums

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * <p>Bid or ask Created by Suminda on 09/06/2014.</p>
 */
@TypeChecked @CompileStatic
public enum QuoteSide {
   /**
    * Ask
    */
   Ask,
   /**
    * Bid
    */
         Bid,
   /**
    * Trade
    */
         Trade,
   /**
    * Default
    */
         Default;
}
