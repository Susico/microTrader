package com.susico.factories

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import it.unimi.dsi.fastutil.longs.LongArraySet
import it.unimi.dsi.fastutil.longs.LongCollection
import it.unimi.dsi.fastutil.longs.LongSet
import it.unimi.dsi.fastutil.longs.LongSets
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
import it.unimi.dsi.fastutil.objects.Object2ObjectMap
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 14/06/2014.
 */
@TypeChecked @CompileStatic
final class CollectionFactory {
   @NotNull private static final LongSet EmptyLongSet = LongSets.EMPTY_SET;

   @NotNull static final LongSet EmptyLongSet() { EmptyLongSet }

   @NotNull private static final Object2ObjectMap EmptyObject2ObjectMap = Object2ObjectMaps.EMPTY_MAP

   @NotNull static final Object2ObjectMap EmptyObject2ObjectMap() { EmptyObject2ObjectMap }

   @NotNull public static LongSet getLongSet() {
      return new LongArraySet();
   }

   @NotNull public static LongSet getLongSet(long ... l) {
      return new LongArraySet(l);
   }

   @NotNull public static LongSet getLongSet(LongCollection l) {
      return new LongArraySet(l);
   }

   @NotNull public static Object2ObjectMap getObjectObjectMap() {
      return new Object2ObjectArrayMap();
   }
}
