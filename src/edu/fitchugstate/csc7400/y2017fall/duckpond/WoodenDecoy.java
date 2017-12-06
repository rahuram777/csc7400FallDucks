/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.NoFly;
import edu.fitchburgstate.csc74002017fall.duckpond.soundbehavior.Silent;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SimpleSwim;

/**
 * Wooden decoys for the duck.
 */
public class WoodenDecoy extends Duck {

	/**
	 * Creates a new wooden decoy with appropriate bitmaps and GIFs
	 */
	public WoodenDecoy() {

		super(BitMapFactory.createBitmap("decoy_still.bmp"), GIFFactory.createGif(null), GIFFactory.createGif("decoy_swim.gif"));

		setFlyBehavior(new NoFly());
		setSoundBehavior(new Silent());
		setSwimBehavior(new SimpleSwim());
	}

	/**
	 * Wooden decoys don't fly.
	 */
	// public void fly() {
	// System.out.println("Decoy still swims");
	// }

	/**
	 * Wooden decoys don't quack
	 */
	// public void quack() {
	// System.out.println("Decoy is silent");
	// }
}
