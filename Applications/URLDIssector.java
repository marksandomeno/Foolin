  

import java.util.*;
import java.io.*;


public class URLDIssector {
	

	public static void main(String args[]) throws IOException {
		
		System.out.println("This code sorts through a text file of urls and organizes them based of the delimter '/' ");
		
		String url = "";
		Scanner fileScan;
		Scanner URLScan;
		
		fileScan = new Scanner (new File("urls.inp"));
		
		while (fileScan.hasNext()) {
			
			url = fileScan.nextLine();
		    System.out.println("url:" + url);
		    
		    URLScan = new Scanner (url);
		    URLScan.useDelimiter("/");
		   
		    while (URLScan.hasNext()) {
		    	
		    	System.out.print(" " + URLScan.next());
		    	
		    	System.out.println();
		    }
		    
		}
		
	}

	public URLDIssector() {
		// TODO Auto-generated constructor stub
	}

}
