package com.susico.factories;

import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

/**
 * Created by Suminda on 14/06/2014.
 */
public class CollectionFactory {
   public static LongSet getLongSet() {
      return new LongArraySet();
   }

   public static Object2ObjectMap getObjectObjectMap() {
      return new Object2ObjectArrayMap();
   }
}
