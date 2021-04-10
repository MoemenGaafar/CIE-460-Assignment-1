/**
 * 
 */
package geometric;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author LENOVO
 *
 */
public class Rectangle extends TwoDimensionalShape{
	
	private int length;
	private int width;
	
	/**
	 * Constructors
	 */
	public Rectangle(int x, int y, int len, int wid, Color c, String l) {
		super.setCenter(x, y);
		super.setColor(c);
		super.setLabel(l);
		this.setLength(len);
		this.setWidth(wid);
	}
	
	public Rectangle(int x, int y, int len, int wid, Color c) {
		super.setCenter(x, y);
		super.setColor(c);
		super.setLabel("New Rectangle");
		this.setLength(len);
		this.setWidth(wid);
	}
	
	public Rectangle(int x, int y, int len, int wid) {
		super.setCenter(x, y);
		super.setColor(Color.GRAY);
		super.setLabel("New Rectangle");
		this.setLength(len);
		this.setWidth(wid);
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getCenterX(), getCenterY(), getLength(), getWidth());
        g.drawString(getLabel(), getCenterX()+5, getCenterY()-5);
	}

	@Override
	public void resize(double scale) {
		setLength((int)(length * scale));
		setWidth((int)(width * scale));
		repaint();
	}

	@Override
	public double getArea() {
		return length * width;
	}

	/*
	 * Setters and Getters
	 */
	public void setLength(int len) {
		length = len;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int wid) {
		width = wid;
	}
	
	public int getWidth() {
		return width;
	}
}
