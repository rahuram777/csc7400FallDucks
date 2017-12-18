/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.behaviorfactories.AbstractBehaviorFactory;
import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.Flybehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.QuackBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SwimBehavior;
import external.BitmapImpl;
import external.GIF;
import external.Bitmap;


/**
 * Base duck class that will be used for ducks on the pond
 */
public class Duck implements DuckType {
	/**
	 * Creates a duck object given the files that will be used for displaying and
	 * animating
	 * 
	 * @param bitmapFilname the still bitmap file name of the duck
	 * @param flyingGifFilename the flying GIF file name
	 * @param swimmingGifFilename the swimming GIF file name
	 */

	public Duck(String bitmapFilename, AbstractBehaviorFactory factory) {
    this.still = this.createBitmap(bitmapFilename);
    this.flybehavior = factory.createFlyBehavior();
    this.swimBehavior = factory.createSwimBehavior();
    this.quackBehavior= factory.createQuackBehavior();
	}

	/**
	 * Displays a still of the duck using bitmap
	 */
	public void display() {
		this.still.show();
	}

	/**
	 * Sets the fly behavior of duck
	 */
	public void setFlyBehavior(Flybehavior flybehavior) {
		this.flybehavior = flybehavior;

	}

	/**
	 * Displays a flying animation using the GIF file.
	 */
	public void fly() {
		flybehavior.Flying();
	}

	/**
	 * Makes a quacking sound
	 */
	public void quack() {
		quackBehavior.quack();
	}

	public Bitmap createBitmap(String fileName) {
		return new BitmapImpl(fileName);
	}
	
	/**
	 * Shows a swimming animation using the GIF file
	 */
	public void swim() {
		swimBehavior.swim();
	}


	protected Bitmap still;
	
	protected Flybehavior flybehavior;

	protected QuackBehavior quackBehavior;

	protected SwimBehavior swimBehavior;
}
