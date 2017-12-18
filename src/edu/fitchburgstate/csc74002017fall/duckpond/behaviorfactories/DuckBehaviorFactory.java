/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-12-18
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.Fly;
import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.Flybehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.*;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.*;
import edu.fitchugstate.csc7400.y2017fall.duckpond.BehaviorFactory;
import external.GIF;

/** 
 *  Defines the Behavior of general ducks
 */

public class DuckBehaviorFactory extends AbstractBehaviorFactory {

	public DuckBehaviorFactory(String fly, String swim) {
		this.fly = BehaviorFactory.createGif(fly);
		this.swim = BehaviorFactory.createGif(swim);
	}

	@Override
	public Flybehavior createFlyBehavior() {
		return  new Fly(this.fly);
	}

	@Override
	public SwimBehavior createSwimBehavior() {
		return new SimpleSwim(this.swim);
	}

	@Override
	public QuackBehavior createQuackBehavior() {
		return new SimpleQuack();
	}

	protected GIF swim;
	protected GIF fly;

}
