package com.susico.event

import groovy.transform.AutoClone
import groovy.transform.AutoExternalize
import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy
import it.unimi.dsi.fastutil.doubles.DoubleCollection
import it.unimi.dsi.fastutil.longs.LongCollection
import it.unimi.dsi.lang.MutableString
import org.jetbrains.annotations.NotNull

/**
 * Created by Suminda on 09/06/2014.
 */
@CompileStatic @AutoExternalize @AutoClone @Canonical @Builder(builderStrategy = SimpleStrategy,
      prefix = "")
abstract class EventBase {
   long timeStamp = -1

   @NotNull abstract EventBase reset()

   @NotNull EventBase recycle() {
      reset()
   }

   void setTimeStamp(long timeStamp) {
      this.timeStamp = timeStamp < 0 ? -1 : timeStamp;
   }

   @NotNull MutableString setStr(@NotNull MutableString sb, @NotNull CharSequence str) {
      sb.delete(0, sb.length()).append(str)
   }

   @NotNull MutableString setStr(@NotNull MutableString sb, @NotNull String str) {
      sb.delete(0, sb.length()).append(str)
   }

   @NotNull StringBuilder setStr(@NotNull StringBuilder sb, @NotNull CharSequence str) {
      sb.delete(0, sb.length()).append(str)
   }

   @NotNull StringBuilder setStr(@NotNull StringBuilder sb, @NotNull String str) {
      sb.delete(0, sb.length()).append(str)
   }

   @NotNull StringBuffer setStr(@NotNull StringBuffer sb, @NotNull CharSequence str) {
      sb.delete(0, sb.length()).append(str)
   }

   @NotNull StringBuffer setStr(@NotNull StringBuffer sb, @NotNull String str) {
      sb.delete(0, sb.length()).append(str)
   }

   public <E1, E2 extends E1> boolean setCollection(@NotNull Collection<E1> to, @NotNull Collection<E2> from) {
      to.clear()

      to.addAll(from)
   }

   public <E1, E2 extends E1> boolean setCollection(@NotNull Collection<E1> to, @NotNull E2 value) {
      to.clear()

      to.add(value)
   }

   boolean setLongCollection(@NotNull LongCollection to, long value) {
      to.clear()

      to.add(value)
   }

   boolean setLongCollection(@NotNull LongCollection to, @NotNull LongCollection from) {
      to.clear()

      to.addAll(from)
   }

   boolean setDoubleCollection(@NotNull DoubleCollection to, double value) {
      to.clear()

      to.add(value)
   }

   boolean setDoubleCollection(@NotNull DoubleCollection to, @NotNull DoubleCollection from) {
      to.clear()

      to.addAll(from)
   }

   @NotNull public <K1, K2 extends K1, V1, V2 extends V1> Map<K1, V1> setMap(@NotNull Map<K1, V1> to,
                                                                             @NotNull Map<K2, V2> from) {
      to.clear()

      to.putAll(from)

      to
   }

   @NotNull public <K1, K2 extends K1, V1, V2 extends V1> Map<K1, V1> setMap(@NotNull Map<K1, V1> to,
                                                          @NotNull Map.Entry<K2, V2> from) {
      setMap(to, from.getKey(), from.getValue())
   }

   @NotNull public <K1, K2 extends K1, V1, V2 extends V1> Map<K1, V1> setMap(@NotNull Map<K1, V1> to, @NotNull K2 key,
                                                          @NotNull V2 value) {
      to.clear()

      to.put(key, value)

      to
   }
}
