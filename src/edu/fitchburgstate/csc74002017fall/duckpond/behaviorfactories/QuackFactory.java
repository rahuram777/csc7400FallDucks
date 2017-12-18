/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.QuackBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.*;


public class QuackFactory implements QuackBehaviorFactory {

	/**
	 * @return object Silent
	 */
	@Override
	public QuackBehavior CreateSilent() {
		
		return new Silent();
	}

	/**
	 * @return object Quack
	 */
	@Override
	public QuackBehavior CreateQuack() {
		
		return new SimpleQuack();
	}

	/**
	 * @return object Squeak
	 */
	@Override
	public QuackBehavior CreateSqueak() {
		
		return new Squeak();
	}

}
