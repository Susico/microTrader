package com.susico.enums

import groovy.transform.CompileStatic;

/**
 * Created by Suminda on 17/06/2014.
 */
@CompileStatic
public enum OrderAction {
   Buy,
   Sell,
   Short,
   BuyToOpen,
   SellToOpen,
   BuyToClose,
   SellToClose,
   Default,
}
