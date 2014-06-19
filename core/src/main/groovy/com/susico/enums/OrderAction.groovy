package com.susico.enums

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * Created by Suminda on 17/06/2014.
 */
@TypeChecked @CompileStatic
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
