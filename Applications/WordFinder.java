
import java.util.*;
import java.io.*;

public class WordFinder {

	
	public static void main(String args[]) throws IOException {
		
		String word, triggerWordFinal, triggerWord;
		Scanner scan = new Scanner(System.in);
		//I am using a file called document.txt  This can easily be replaced
		Scanner filescan = new Scanner (new File("document.txt"));
		int counter = 0;
		
		
		System.out.println("Enter Search Word");
		triggerWord = scan.nextLine();
		triggerWordFinal = triggerWord.toLowerCase();
		
		
		while(filescan.hasNext() == true) {
			
			word = filescan.nextLine().toLowerCase();
			counter += 1;
			if (word.contains(triggerWordFinal)) {
				
				System.out.print(word);
				System.out.println("  [FOUND WORD: " + triggerWordFinal.toUpperCase() + ", ON LINE: " + counter + "]");
				
			} else {

				System.out.println(word);
			}
		
		}
	
	}

	public WordFinder() {
		// TODO Auto-generated constructor stub
	}

}
