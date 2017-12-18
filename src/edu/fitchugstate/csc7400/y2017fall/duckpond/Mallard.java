/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories.DuckBehaviorFactory;

/**
 * Mallard duck for pond
 */
public class Mallard extends Duck {

	/**
	 * Creates a new Mallard duck with appropriate bitmaps and GIFs
	 */
	public Mallard() {
		super("mallard_still.bmp", new DuckBehaviorFactory("mallard_fly.gif", "mallad_swim.gif"));
	}
}
