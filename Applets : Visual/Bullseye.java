
import java.applet.Applet;
import java.awt.*;


public class Bullseye extends Applet {
	
	
	public void paint (Graphics page) {
		
		final int MAX_WIDTH = 300;
		final int NUM_RINGS = 5;
		final int RING_WIDTH = 25;
		int x = 0;
		int y = 0;
		int diameter = 0;
		
		
		setBackground (Color.black);
		
		diameter = MAX_WIDTH;
		page.setColor(Color.white);
		
		for(int count = 0; count < NUM_RINGS; count++) {
			
			if(page.getColor() == Color.black) {
				
				page.setColor(Color.white);
			} else {
				
				page.setColor(Color.black);
			}
			
			page.fillOval(x, y, diameter, diameter);
			
			//make diameter of circle smaller and smaller
			diameter -= (2 * RING_WIDTH);
			x += RING_WIDTH;
			y += RING_WIDTH;
		}
		
		//final red circle in middle with smallest diameter
		page.setColor(Color.red);
		page.fillOval(x, y, diameter, diameter);
		
	}
	
	public static void main(String args[]) {
		
	
		
	}

	public Bullseye() {
		// TODO Auto-generated constructor stub
	}

}
