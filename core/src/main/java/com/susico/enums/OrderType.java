package com.susico.enums;

/**
 * Created by Suminda on 16/06/2014.
 */
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
