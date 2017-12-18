/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories.*;
/**
 * Main program that simulates a pond
 */
public class SimuPond {
	/**
	 * Runs the duck pond simulator
	 */
	public static void main(String[] args) {
		
		FlyBehaviorFactory flyFactory = new FlyFactory();
		QuackBehaviorFactory quackFactory = new QuackFactory();
		SwimBehaviorFactory swimFactory = new SwimFactory();
		
		Duck mallardDuck = new Mallard();
		Duck redheadDuck = new Redhead();
		Duck rubberDuck = new RubberDuck();
		Duck woodenDecoyDuck = new WoodenDecoy();
	
		mallardDuck.setFlyBehavior(flyFactory.CreateFlyWithWings());
		mallardDuck.setSoundBehavior(quackFactory.CreateQuack());
		mallardDuck.setSwimBehavior(swimFactory.CreateGeneralSwim());
		
		redheadDuck.setFlyBehavior(flyFactory.CreateFlyWithWings());
		redheadDuck.setSoundBehavior(quackFactory.CreateQuack());
		redheadDuck.setSwimBehavior(swimFactory.CreateGeneralSwim());
			
	  rubberDuck.setFlyBehavior(flyFactory.CreateNoFly());
	  rubberDuck.setSoundBehavior(quackFactory.CreateSqueak());
	  rubberDuck.setSwimBehavior(swimFactory.CreateGeneralSwim());
	  
	  woodenDecoyDuck.setFlyBehavior(flyFactory.CreateNoFly());
	  woodenDecoyDuck.setSoundBehavior(quackFactory.CreateSilent());
	  woodenDecoyDuck.setSwimBehavior(swimFactory.CreateGeneralSwim());
	  
		System.out.println("Adding ducks to duck pond");
		addDuck(mallardDuck);
	  addDuck(redheadDuck);
		addDuck(rubberDuck);
		addDuck(woodenDecoyDuck);

		System.out.println("\nIdyllic pond");
		pond.swimming();

		System.out.println("\nDog runs into pond");
		pond.spook();
	}

	/**
	 * Adds a duck to the pond, just a helper function
	 * 
	 * @param duck the duck to add to the pond
	 */
	public static void addDuck(DuckType duck) {
		duck.display();
		pond.addDuck(duck);
	}

	/**
	 * The pond for the simulation
	 */
	private static DuckPond pond = new DuckPond();
}
