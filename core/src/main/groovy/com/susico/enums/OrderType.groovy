package com.susico.enums

import groovy.transform.CompileStatic;

/**
 * Created by Suminda on 16/06/2014.
 */
@CompileStatic
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
