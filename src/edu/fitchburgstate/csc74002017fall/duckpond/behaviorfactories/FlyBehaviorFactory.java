/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.*;
/**
 * Declaring methods to create fly objects
 */
public interface FlyBehaviorFactory {
  public FlyBehavior CreateFlyWithWings();
  public FlyBehavior CreateNoFly();
}
