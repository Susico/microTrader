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
    * Session
    */
   Session,
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
    * All or None (wait until all can be filled)
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
    * Close of session
    */
   OnSessionClose,
   /**
    * On Open
    */
   OnMarketOpen,
   /**
    * Opening of PM session
    */
   OnPMOpen,
   /**
    * On session open
    */
   OnSessionOpen,
   /**
    * Default
    */
   Default,
}
