/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior;

import external.GIF;

public class SimpleSwim implements SwimBehavior {

	public SimpleSwim(GIF swimBehavior){
		this.swimBehavior = swimBehavior;
	}
	/** 
   *  Outputs a swimming animation
   */
	@Override
	public void swim() {
		swimBehavior.animate();
	}
	
	protected GIF swimBehavior;
}
