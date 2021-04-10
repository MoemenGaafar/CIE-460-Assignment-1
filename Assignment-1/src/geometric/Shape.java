/**
 * 
 */
package geometric;
import java.awt.*;

/**
 * @author LENOVO
 *
 */
public class Shape extends Component{
	private int position;
	
	public void paint(Graphics g) {
		g.drawOval(40, 40, 60, 60); //FOR CIRCLE
	}
}
