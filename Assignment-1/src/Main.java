/**
 * 
 */

import javax.swing.*;
import java.awt.*;
import geometric.Shape;

/**
 * @author LENOVO
 *
 */
public class Main {
	
	
	public static void main(String a[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        Shape myshape = new Shape();
        frame.add(myshape);
        frame.setVisible(true);
    }
	

//	public void paint(Graphics g){
//        g.drawOval(40, 40, 60, 60); //FOR CIRCLE
//        g.drawRect(80, 30, 200, 200); // FOR SQUARE
//        g.drawRect(200, 100, 100, 200); // FOR RECT
//	}
		 
}