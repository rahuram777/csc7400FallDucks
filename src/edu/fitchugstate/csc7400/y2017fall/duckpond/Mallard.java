/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.SimpleFly;
import edu.fitchburgstate.csc74002017fall.duckpond.soundbehavior.SimpleQuack;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SimpleSwim;

/**
 * Mallard duck for pond
 */
public class Mallard extends Duck {

	/**
	 * Creates a new Mallard duck with appropriate bitmaps and GIFs
	 */
	public Mallard() {
		super(BehaviorFactory.createBitmap("mallard_still.bmp"), BehaviorFactory.createGif("mallard_fly.gif"), BehaviorFactory.createGif("mallad_swim.gif"));
		
		setFlyBehavior(new SimpleFly());
		setSoundBehavior(new SimpleQuack());
		setSwimBehavior(new SimpleSwim());
	}
}
