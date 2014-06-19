package com.susico.enums

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * Created by Suminda on 16/06/2014.
 */
@TypeChecked @CompileStatic
public enum OrderType {
   Limit,
   MarketToLimit,
   MarketWithProtection,
   Quote,
   Stop,
   StopLimit,
   TrailingLimitIfTouched,
   TrailingMarketIfTouched,
   TrailingStop,
   TrailingStopLimit,
   MarketIfTouched,
   PeggedToMarket,
   PeggedToMid,
   PeggedToUnderlier,
   PeggedToBenchmark,
   SnapToMarket,
   SnapToMid,
   SnapToUnderlier,
   SnapToBenchmark,
   LimitIfTouched,
   PriceImprovement,
   LimitToMoC,
   MarketToMoC,
   LimitToLoC,
   MarketToLoC,
   LoOToLimit,
   LoOToMarket,
   MoOToLimit,
   MoOToMarket,
}
