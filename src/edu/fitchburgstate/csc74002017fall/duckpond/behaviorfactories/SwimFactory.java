/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SwimBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.*;

public class SwimFactory implements SwimBehaviorFactory {

	/**
	 * @return object SimpleSwim
	 */
	@Override
	public SwimBehavior CreateGeneralSwim() {
		// TODO Auto-generated method stub
		return new SimpleSwim();
	}

}
