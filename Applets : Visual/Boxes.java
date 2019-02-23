//paints boxes with random height width and location    
//skinny vertical  -> yellow  (accorindg to my set standards) 
//skinny horizantal  ->green  
//normal -> clear


import java.applet.*;
import java.awt.*;
import java.util.*;

public class Boxes extends Applet {
	
public void paint(Graphics pen) {
	
	setBackground(Color.black);
	final int NUM_BOXES = 1000, THICKNESS = 5, MAX_SIDE = 50, MAX_X = 350, MAX_Y = 250;
	int x, y, width, height;
	
	Random generator = new Random();
	
	for(int count = 0; count < NUM_BOXES; count++) {
		
		x = generator.nextInt(MAX_X) + 1;
		y = generator.nextInt(MAX_Y) + 1;
		
		width = generator.nextInt(MAX_SIDE) + 1;
		height = generator.nextInt(MAX_SIDE) + 1;
		
		if (width <= THICKNESS) {
			
			pen.setColor(Color.YELLOW);
			pen.fillRect(x, y, width, height);
			
		} else if (height <= THICKNESS) {
				
				pen.setColor(Color.green);
				pen.fillRect(x, y, width, height);
			} else {
				
				pen.setColor(Color.white);
				pen.drawRect(x, y, width, height);
		}
	}
	
	
	
	
}

	public Boxes() {
		// TODO Auto-generated constructor stub
	}

}
