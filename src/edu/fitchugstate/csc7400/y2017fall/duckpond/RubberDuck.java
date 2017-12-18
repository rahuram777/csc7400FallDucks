/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.NoFly;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.Squeak;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SimpleSwim;

/**
 * Rubber duck for pond
 */
public class RubberDuck extends Duck {

	/**
	 * Creates a new rubber duck
	 */
	public RubberDuck() {
		super("rubber_duck_still.bmp", null, "rubber_duck_swim.gif");
	}
}
