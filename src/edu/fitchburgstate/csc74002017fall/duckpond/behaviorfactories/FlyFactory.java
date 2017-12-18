/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.Flybehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.*;


public class FlyFactory implements FlyBehaviorFactory {

	/**
	 * @return object SimpleFly
	 */
	@Override
	public Flybehavior CreateFlyWithWings() {
		// TODO Auto-generated method stub
		return new Fly();
	}

	/**
	 * @return object NoFly
	 */
	@Override
	public Flybehavior CreateNoFly() {
		// TODO Auto-generated method stub
		return new CannotFly();
	}

}
