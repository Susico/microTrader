package com.susico.enums

import groovy.transform.CompileStatic;

/**
 * Created by Suminda on 09/06/2014.
 */
@CompileStatic
public enum ContingentOrderAction {
   /**
    * One Cancels Other
    */
   CancelsAll,
   /**
    * Proportionate
    */
         CancelsProportionate,
   /**
    * One Triggers Other
    */
         TriggerAll,
   /**
    * Proportionate
    */
         TriggerProportionate,
   /**
    * Change to market
    */
         ChangeToMarket,
   /**
    * Default
    */
         Default,
}
