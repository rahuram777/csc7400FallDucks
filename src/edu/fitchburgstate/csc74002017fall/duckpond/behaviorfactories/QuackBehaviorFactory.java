/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.*;

/**
 * Declares methods to create quack objects
 */
public interface QuackBehaviorFactory {
  public QuackBehavior CreateSilent();
  public QuackBehavior CreateQuack();
  public QuackBehavior CreateSqueak();
}
