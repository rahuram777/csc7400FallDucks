/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior;


public class SimpleQuack implements QuackBehavior {
	/** 
   *  Outputs a Quack sound
   */
	@Override
	public void quack() {
		 System.out.println("Quack");
	}

}
