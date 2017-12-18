/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-12-18
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.Flybehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.QuackBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SwimBehavior;

/** 
 *  This is a Behavior class to define the behaviors of duck
 */
public abstract class AbstractBehaviorFactory {

	public abstract Flybehavior createFlyBehavior();
	public abstract SwimBehavior createSwimBehavior();
	public abstract QuackBehavior createQuackBehavior();
	
}
