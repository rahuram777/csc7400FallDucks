/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * Date: 2017-11-28
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package edu.fitchugstate.csc7400.y2017fall.duckpond;
import external.Bitmap;
import external.BitmapImpl;
import external.GIF;
import external.GifImpl;
public class BehaviorFactory {
	/** 
	 *  Creates a new Bitmap instance
	 */
	public static Bitmap createBitmap(String fileName) {
		return new BitmapImpl(fileName);
	}
	
	
	/** 
	 *  Creates a new GIF instance
	 */
	public static GIF createGif(String fileName) {
		return new GifImpl(fileName);
	}
}
