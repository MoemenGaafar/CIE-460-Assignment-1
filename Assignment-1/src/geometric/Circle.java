/**
 * 
 */
package geometric;
import java.awt.*;
import  java.lang.Math;

/**
 * @author LENOVO
 *
 */
public class Circle extends TwoDimensionalShape {
	
	private int radius;
	
	/**
	 * Constructors
	 */
	public Circle(int x, int y, int r, Color c, String l) {
		super.setCenter(x, y);
		super.setColor(c);
		super.setLabel(l);
		this.setRadius(r);
	}
	
	public Circle(int x, int y, int r, Color c) {
		super.setCenter(x, y);
		super.setColor(c);
		super.setLabel("New Circle");
		this.setRadius(r);
	}
	
	public Circle(int x, int y, int r) {
		super.setCenter(x, y);
		super.setColor(Color.GRAY);
		super.setLabel("New Circle");
		this.setRadius(r);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getCenterX(), getCenterY(), getRadius(), getRadius());
        g.drawString(getLabel(), getCenterX()+5, getCenterY()-5);
	}

	@Override
	public void resize(double scale) {
		setRadius((int)(radius * scale));
		repaint();
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
	
	/*
	 * Setter and Getter
	 */
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}

}
