package com.susico.enums

import groovy.transform.CompileStatic;

/**
 * Created by Suminda on 16/06/2014.
 */
@CompileStatic
public enum TriggerMethod {
   Market,
   Bid,
   Ask,
   Last,
   DoubleLast,
   DoubleBidAsk,
   Default,
}
