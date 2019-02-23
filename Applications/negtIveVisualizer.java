import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.applet.*;
import java.awt.Graphics;
import java.math.*;

public class negtIveVisualizer extends Applet{
	
	
	
		
		

		
	

	
	public static void main(String args[]) throws IOException {
		
		String word, triggerWordFinal, triggerWord;
		Scanner scan = new Scanner(System.in);
		//I am using a file called document.txt  This can easily be replaced
		Scanner thescan = new Scanner (new File("negativeVisualizerTxt.txt"));
		int counter = 0;
		int dots = 0;
		System.out.println("Enter Search Word");
		triggerWord = scan.nextLine();
		triggerWordFinal = triggerWord.toLowerCase();
		
		
		while(thescan.hasNext() == true) {
			
			word = thescan.nextLine().toLowerCase();
			counter += 1;
			if (word.contains(triggerWordFinal)) {
				
				System.out.print(word);
				System.out.println("  [FOUND WORD: " + triggerWordFinal.toUpperCase() + ", ON LINE: " + counter + "]");
				dots += 1;
				
			} else {

				System.out.println(word);
			}
	
		}
		
		Random r = new Random();
		int randomInt = r.nextInt(100) + 1;
		int x = randomInt;
		int y = randomInt;
		final int WIDTH = 10;
		final int HEIGHT = 10;
		Graphics page = null;
		
		for (int i = 0; i<dots; i++) {
			
			page.drawOval(x, y, WIDTH, HEIGHT);
		}
	
	}	
	

	
	
	

	public negtIveVisualizer() {
		// TODO Auto-generated constructor stub
	}

}
