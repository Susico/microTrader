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
    * Good Till Cancelled
    */
   GTC,
   /**
    * Good Till Date
    */
   GTD,
   /**
    * Good after date
    */
   GAD,
   /**
    * Good after date till date
    */
   GADTD,
   /**
    * Fill or Kill
    */
   FoK,
   /**
    * Immediate or Cancel
    */
   IoC,
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
