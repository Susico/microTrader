package com.susico.factories;

import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Suminda on 14/06/2014.
 */
public final class MutableStringFactory {
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
