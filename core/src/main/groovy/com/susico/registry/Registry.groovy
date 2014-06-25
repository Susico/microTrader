package com.susico.registry

import groovy.transform.CompileStatic
import it.unimi.dsi.fastutil.objects.Object2ObjectMap

import static com.susico.factories.CollectionFactory.getObjectObjectTreeMap

/**
 * Created by Suminda on 24/06/2014.
 */
@CompileStatic
trait Registry
{
   final Object2ObjectMap registry = getObjectObjectTreeMap()

   private getRegistry() { registry }

   def set(key, value) { registry.put(key, value) }

   def get(key) { registry.get(key) }
}
