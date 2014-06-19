package com.susico.enums

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * Quote level. <p>Created by Suminda on 09/06/2014.</p>
 */
@TypeChecked @CompileStatic
public enum QuoteLevel {
   /**
    * Best bid ask only (Level 1)
    */
   TopAndBottomOnly,
   /**
    * Ranked
    */
         Ranked,
   /**
    * Ordering based on priority queue
    */
         PriorityOrdered,
   /**
    * MarketMaker
    */
         MarketMaker,
   /**
    * Unknown level
    */
         Default,
}
