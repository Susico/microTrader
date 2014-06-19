package com.susico.factories

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import it.unimi.dsi.lang.MutableString
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 14/06/2014.
 */
@TypeChecked @CompileStatic
final class MutableStringFactory {
   @NotNull private static final MutableString NullMutableString = new MutableString(0);

   @NotNull static final MutableString NullMutableString() { NullMutableString }

   @NotNull public static MutableString getMutableString() {
      return new MutableString();
   }

   @NotNull public static MutableString getMutableString(CharSequence cseq) {
      return new MutableString(cseq);
   }

   @NotNull public static MutableString getMutableString(String s) {
      return new MutableString(s);
   }
}
