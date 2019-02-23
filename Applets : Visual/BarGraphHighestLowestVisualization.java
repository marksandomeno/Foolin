import java.util.*;
import java.applet.*;
import java.awt.*;


// random bar graph that recognizes highest and lowest values
public class BarGraphHighestLowestVisualization extends Applet {
	
	public void paint(Graphics pen) {
		
		final int NUM_BARS = 10, WIDTH = 15, MAX_HEIGHT = 200, GAP = 2;
		int tallestX = 0, shortestX = 0, tallest = 0, shortest = 0;
		int x, height;
		
		Random generator = new Random();
		setBackground (Color.black);
		
		pen.setColor(Color.blue);
		x = GAP;
		
		for(int count = 0; count < NUM_BARS; count++) {
			
			height = generator.nextInt(MAX_HEIGHT) + 1;
			pen.fillRect(x, MAX_HEIGHT - height, WIDTH, height);
			
			if (height > tallest) {
				
				tallestX = x;
				tallest = height;
			}
			
			if (height < shortest) {
				
				shortestX = x;
				shortest = height;
			}
			
			x = x + WIDTH + GAP;
		}
		
		
		//shortest bar
				pen.setColor(Color.green);
				pen.fillRect(shortestX, MAX_HEIGHT-shortest, WIDTH, shortest);
				
				
		//tallest bar
		pen.setColor(Color.red);
		pen.fillRect(tallestX, MAX_HEIGHT-tallest, WIDTH, tallest);
		
		
		
	}

}
