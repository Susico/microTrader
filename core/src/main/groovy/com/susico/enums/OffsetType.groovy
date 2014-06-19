package com.susico.enums

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * Created by Suminda on 16/06/2014.
 */
@TypeChecked @CompileStatic
public enum OffsetType {
   /**
    * %
    */
   Pct,
   /**
    * Absolute
    */
         Abs,
   /**
    * Default
    */
         Default;
}
