/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.SimpleFly;
import edu.fitchburgstate.csc74002017fall.duckpond.soundbehavior.SimpleQuack;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SimpleSwim;

/** 
 *  Redhead duck for pond
 */
public class Redhead extends Duck {

  /** 
   *  Creates new redhead duck with appropriate bitmaps and GIFs.
   */
  public Redhead() {
	
	super(BehaviorFactory.createBitmap("redhead_still.bmp"), BehaviorFactory.createGif("redhead_fly.gif"), BehaviorFactory.createGif("redhead_swim.gif"));
	setFlyBehavior(new SimpleFly());
	setSoundBehavior(new SimpleQuack());
	setSwimBehavior(new SimpleSwim());
  }
}
