package com.susico.event;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Suminda on 09/06/2014.
 */
public class EventBase {
   protected void setSB(StringBuilder sb, StringBuilder str) {
      sb.delete(0, sb.length()).append(str == null ? "" : str);
   }

   protected void setSB(StringBuilder sb, StringBuffer str) {
      sb.delete(0, sb.length()).append(str == null ? "" : str);
   }

   protected void setSB(StringBuilder sb, String str) {
      sb.delete(0, sb.length()).append(str == null ? "" : str);
   }

   protected void setSB(StringBuffer sb, StringBuilder str) {
      sb.delete(0, sb.length()).append(str == null ? "" : str);
   }

   protected void setSB(StringBuffer sb, StringBuffer str) {
      sb.delete(0, sb.length()).append(str == null ? "" : str);
   }

   protected void setSB(StringBuffer sb, String str) {
      sb.delete(0, sb.length()).append(str == null ? "" : str);
   }

   protected <E1, E2 extends E1> void setCollection(Collection<E1> to, Collection<E2> from) {
      to.clear();

      if ( from != null ) to.addAll(from);
   }

   protected <E1, E2 extends E1> void setCollection(Collection<E1> to, E2 value) {
      to.clear();

      if ( value != null ) to.add(value);
   }

   protected <K1, K2 extends K1, V1, V2 extends V1> void setMap(Map<K1, V1> to, Map<K2, V2> from) {
      to.clear();

      if ( from != null ) to.putAll(from);
   }

   protected <K1, K2 extends K1, V1, V2 extends V1> void setMap(Map<K1, V1> to, Map.Entry<K2, V2> from) {
      if ( from != null ) setMap(to, from.getKey(), from.getValue());
   }

   protected <K1, K2 extends K1, V1, V2 extends V1> void setMap(Map<K1, V1> to, K2 key, V2 value) {
      to.clear();

      if ( key != null && value != null ) to.put(key, value);
   }
}
