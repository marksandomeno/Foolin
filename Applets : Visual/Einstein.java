
import java.applet.Applet;
import java.awt.*;


public class Einstein extends Applet {




	public Einstein() {
		
	}
	
	
	public void paint (Graphics page) {
		
		
		for(int i = 0;i<500;i++) {

		page.draw3DRect(i, i, 100, 100, false);
		page.drawOval(i+1, i, 50, 50);
		
		

		}
		


		
	
		
		
		
		
		
	}

}
