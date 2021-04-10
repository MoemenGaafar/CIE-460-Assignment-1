/**
 * 
 */
package geometric;

import java.awt.Color;

/**
 * @author LENOVO
 *
 */
public class Square extends Rectangle {

	/**
	 * Constructors
	 */
	public Square(int x, int y, int s, Color c, String l) {
		super(x, y, s, s, c, l);
	}

	public Square(int x, int y, int s, Color c) {
		super(x, y, s, s, c, "New Square");
	}


	public Square(int x, int y, int s) {
		super(x, y, s, s, Color.GRAY, "New Square");
	}

}
