/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.FlyBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.*;


public class FlyFactory implements FlyBehaviorFactory {

	/**
	 * @return object SimpleFly
	 */
	@Override
	public FlyBehavior CreateFlyWithWings() {
		// TODO Auto-generated method stub
		return new SimpleFly();
	}

	/**
	 * @return object NoFly
	 */
	@Override
	public FlyBehavior CreateNoFly() {
		// TODO Auto-generated method stub
		return new NoFly();
	}

}
