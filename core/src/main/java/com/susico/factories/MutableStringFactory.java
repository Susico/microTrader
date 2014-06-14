package com.susico.factories;

import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Suminda on 14/06/2014.
 */
public class MutableStringFactory {
   @NotNull public static MutableString getMutableString() {
      return new MutableString();
   }
}
