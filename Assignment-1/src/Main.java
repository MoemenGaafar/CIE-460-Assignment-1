/**
 * 
 */

import javax.swing.*;
import java.awt.*;
import geometric.Circle;
import geometric.Rectangle;
import geometric.Square;


/**
 * @author LENOVO
 *
 */
public class Main {
	
	
	public static void main(String a[]){
		
		// Set-up the drawing frame
        JFrame frame = new JFrame("Shapes");  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        Circle circle = new Circle(50, 50, 80, Color.blue, "Moemen Circle");
        
        // Shift the circle to the right
        System.out.println("Circle X-Coordinate is: " + circle.getCenterX());
        circle.goRight();
        System.out.println("Circle X-Coordinate after shifting is: " + circle.getCenterX());
        
        // Resize the circle (Enlarge by 2x)
        System.out.println("Circle Perimeter = " + circle.getPerimeter());
        circle.resize(2);
        System.out.println("Circle Perimeter after scaling = " + circle.getPerimeter());
        
        // Add the circle to the drawing frame
        frame.add(circle);

        // Show the frame
        frame.setVisible(true);   
    }
		 
}
