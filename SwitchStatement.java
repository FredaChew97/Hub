//Switch Statement

import java.util.Scanner;

public class Apples_6{
	
	public static void main(String args[]){
		
		Scanner bucky = new Scanner;
		
		int age;//declaration
		
		System.out.printIn("Please enter age from 1 to 3");
		
		age = bucky.nextInt();
		
		switch(age){
			
			case 1: 
				System.out.printIn("You can crawl");
				
			case 2: 
				System.out.printIn("You can talk");
			
			case 3: 
				System.out.printIn("You can walk");
				
			default:
				System.out.printIn("Please enter age again");
			
		}//end switch
		
	}//end main
	
	
}//end class