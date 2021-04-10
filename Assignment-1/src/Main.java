/**
 * 
 */

import javax.swing.*;
import java.awt.*;
import geometric.Shape;
import geometric.Circle;
import geometric.Temp;
import geometric.Rectangle;

/**
 * @author LENOVO
 *
 */
public class Main {
	
	
	public static void main(String a[]){
        JFrame frame = new JFrame();
//        frame.setLayout(new FlowLayout());

        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setLayout(new FlowLayout());

        frame.setSize(400,400);
//        Temp myshape = new Temp();
        Shape circle = new Circle(10,10,80, Color.blue, "Moemen Circle");
//        Shape rect = new Rectangle(80, 100, 120, 120);
        frame.add(circle);
//        frame.add(rect);
        frame.setVisible(true);   
    }
	

//	public void paint(Graphics g){
//        g.drawOval(40, 40, 60, 60); //FOR CIRCLE
//        g.drawRect(80, 30, 200, 200); // FOR SQUARE
//        g.drawRect(200, 100, 100, 200); // FOR RECT
//	}
		 
}
