
import java.util.Scanner;



public class PalinedroneTester {
	

	public static void main(String arg[]) {
		
		
		String str;
		//Used when asked to play another time
		String another = "y";
		Scanner scan = new Scanner (System.in);
		
		while (another.equalsIgnoreCase("y")) /*allows y or y*/ {
			
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();
			
			//get indexs of string
			int left = 0;
			int right = str.length() - 1;
			
			while (str.charAt(left) == str.charAt(right) && left < right) {
				
				
				left++;
				right--;
				
			}
					
			System.out.println();
			
			if (left < right) {
				
				System.out.println("That string is NOT a palindrome.");
			} else {
				
				System.out.println("That string IS a palindrome.");
				System.out.println();
				System.out.println("Test another? (y/n)");
				another = scan.nextLine();
				
			}
			
			
		}
		
		
		
		
	}

}
