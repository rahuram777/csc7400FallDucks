/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.NoFly;
import edu.fitchburgstate.csc74002017fall.duckpond.soundbehavior.Squek;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SimpleSwim;

/**
 * Rubber duck for pond
 */
public class RubberDuck extends Duck {

	/**
	 * Creates a new rubber duck
	 */
	public RubberDuck() {
		
		super(BitMapFactory.createBitmap("rubber_duck_still.bmp"), GIFFactory.createGif(null), GIFFactory.createGif("rubber_duck_swim.gif"));
		
		setFlyBehavior(new NoFly());
		setSoundBehavior(new Squek());
		setSwimBehavior(new SimpleSwim());
	}

	/**
	 * Rubber duck don't fly
	 */
	// public void fly() {
	// System.out.println("Rubber duck continues to swim");
	// }

	/**
	 * Squeaks like a rubber duck.
	 */
	// public void quack() {
	// System.out.println("Squeak");
	// }
}
