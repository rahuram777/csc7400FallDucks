/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchburgstate.csc74002017fall.duckpond.flybehavior.FlyBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.quackbehavior.QuackBehavior;
import edu.fitchburgstate.csc74002017fall.duckpond.swimbehavior.SwimBehavior;
import external.GIF;
import external.Bitmap;
import external.BitmapImpl;
import external.GifImpl;

/**
 * Base duck class that will be used for ducks on the pond
 */
public class Duck implements DuckType {
	/**
	 * Creates a duck object given the files that will be used for displaying and
	 * animating
	 * 
	 * @param bitmapFilname
	 *          the still bitmap file name of the duck
	 * @param flyingGifFilename
	 *          the flying GIF file name
	 * @param swimmingGifFilename
	 *          the swimming GIF file name
	 */

	public Duck(String bitmapFilename, String flyingGifFilename, String swimmingGifFilename) {
    this.still = BehaviorFactory.createBitmap(bitmapFilename);
    this.flying = BehaviorFactory.createGif(flyingGifFilename);
    this.swimming = BehaviorFactory.createGif(swimmingGifFilename);
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
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;

	}

	/**
	 * Sets the sound behavior of duck
	 */
	public void setSoundBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/**
	 * Sets the swimming behavior of duck
	 */
	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}

	/**
	 * Displays a flying animation using the GIF file.
	 */
	public void fly() {
		flyBehavior.fly(this.flying);
	}

	/**
	 * Makes a quacking sound
	 */
	public void quack() {
		quackBehavior.quack();
	}

	/**
	 * Shows a swimming animation using the GIF file
	 */
	public void swim() {
		swimBehavior.swim(this.swimming);
	}

	/**
	 * For displaying a still duck image, used when adding ducks to the pond.
	 */
	protected Bitmap still;

	/**
	 * GIF of duck flying
	 */
	protected GIF flying;

	/**
	 * GIF of duck swimming
	 */
	protected GIF swimming;

	protected FlyBehavior flyBehavior;

	protected QuackBehavior quackBehavior;

	protected SwimBehavior swimBehavior;
}
