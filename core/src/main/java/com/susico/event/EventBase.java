package com.susico.event;

import it.unimi.dsi.fastutil.doubles.DoubleCollection;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.lang.MutableString;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Map;

import static com.susico.factories.MutableStringFactory.getMutableString;

/**
 * Created by Suminda on 09/06/2014.
 */
public class EventBase {
   @NotNull protected final MutableString    NullString            = getMutableString();
   @NotNull protected final LongSet          EmptyLongSet          = LongSets.EMPTY_SET;
   @NotNull protected final Object2ObjectMap EmptyObject2ObjectMap = Object2ObjectMaps.EMPTY_MAP;

   @NotNull protected long timeStamp = 0;

   @NotNull public long getTimeStamp() {
      return timeStamp;
   }

   public void setTimeStamp(@NotNull final long timeStamp) {
      this.timeStamp = timeStamp;
   }

   protected void setStr(@NotNull MutableString sb, @NotNull CharSequence str) {
      sb.delete(0, sb.length()).append(str);
   }

   protected void setStr(@NotNull MutableString sb, @NotNull String str) {
      sb.delete(0, sb.length()).append(str);
   }

   protected void setStr(@NotNull StringBuilder sb, @NotNull CharSequence str) {
      sb.delete(0, sb.length()).append(str);
   }

   protected void setStr(@NotNull StringBuilder sb, @NotNull String str) {
      sb.delete(0, sb.length()).append(str);
   }

   protected void setStr(@NotNull StringBuffer sb, @NotNull CharSequence str) {
      sb.delete(0, sb.length()).append(str);
   }

   protected void setStr(@NotNull StringBuffer sb, @NotNull String str) {
      sb.delete(0, sb.length()).append(str);
   }

   protected <E1, E2 extends E1> void setCollection(@NotNull Collection<E1> to, @NotNull Collection<E2> from) {
      to.clear();

      to.addAll(from);
   }

   protected <E1, E2 extends E1> void setCollection(@NotNull Collection<E1> to, @NotNull E2 value) {
      to.clear();

      to.add(value);
   }

   protected void setLongCollection(@NotNull LongCollection to, long value) {
      to.clear();

      to.add(value);
   }

   protected void setLongCollection(@NotNull LongCollection to, @NotNull LongCollection from) {
      to.clear();

      to.addAll(from);
   }

   protected void setDoubleCollection(@NotNull DoubleCollection to, double value) {
      to.clear();

      to.add(value);
   }

   protected void setDoubleCollection(@NotNull DoubleCollection to, @NotNull DoubleCollection from) {
      to.clear();

      to.addAll(from);
   }

   protected <K1, K2 extends K1, V1, V2 extends V1> void setMap(@NotNull Map<K1, V1> to, @NotNull Map<K2, V2> from) {
      to.clear();

      to.putAll(from);
   }

   protected <K1, K2 extends K1, V1, V2 extends V1> void setMap(@NotNull Map<K1, V1> to,
                                                                @NotNull Map.Entry<K2, V2> from) {
      setMap(to, from.getKey(), from.getValue());
   }

   protected <K1, K2 extends K1, V1, V2 extends V1> void setMap(@NotNull Map<K1, V1> to, @NotNull K2 key,
                                                                @NotNull V2 value) {
      to.clear();

      to.put(key, value);
   }
}
