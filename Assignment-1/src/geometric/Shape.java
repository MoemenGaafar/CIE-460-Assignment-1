/**
 * 
 */
package geometric;
import java.awt.*;

/**
 * @author LENOVO
 *
 */
public abstract class Shape extends Component{
	
	protected int centerX;
	protected int centerY;
	protected Color color;
	protected String label;
	
	
	/*
	 * Define abstract methods to be overriden by each shape
	 */
	public abstract void paint(Graphics g);
	public abstract void resize(double scale);
	public abstract double getArea();
	
	
	/*
	 * Define common methods to all shapes
	 */
	public void goUp() {
		centerY -= 10;
		repaint();
	}
	
	public void goDown() {
		centerY += 10;
		repaint();
	}
	
	public void goLeft() {
		centerX -= 10;
		repaint();
	}
	
	public void goRight() {
		centerX += 10;
		repaint();
	}
	
	
	/*
	 *  Setters and Getters
	 */
	public void setCenter(int x, int y) {
		centerX = x;
		centerY = y;
	}
	
	public int getCenterX() {
		return centerX;
	}
	
	public int getCenterY() {
		return centerY;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setLabel(String l) {
		label = l;
	}
	
	public String getLabel() {
		return label;
	}
	
}
