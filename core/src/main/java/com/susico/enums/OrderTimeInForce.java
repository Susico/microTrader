package com.susico.enums;

/**
 * <p>Created by Suminda on 09/06/2014.</p>
 */
public enum OrderTimeInForce {
   /**
    * Day
    */
   Day,
   /**
    * Good Till Ccancelled
    */
   GTC,
   /**
    * Good Till Date
    */
   GTD,
   /**
    * Fill or Kill
    */
   FoK,
   /**
    * Imitate or Cancel
    */
   IoC,
   /**
    * All or None
    */
   AoN,
   /**
    * On Close
    */
   OnMarketClose,
   /**
    * Close of AM session (Japan)
    */
   OnAMClose,
   /**
    * On Open
    */
   OnMarketOpen,
   /**
    * Opening of PM session
    */
   OnPMOpen,
   /**
    * Default
    */
   Default,
}
