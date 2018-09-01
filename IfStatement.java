//If Statement
import java.util.Scanner;

public class Apples_5 {

	public static void main(String []args){
		
		Scanner bucky = new Scanner(System.in);
		
		int num;
		
		System.out.println("Please enter a number");
		num = bucky.nextInt();
		
		if(num ==9){
			System.out.print("Yes");
		}
		
		else
			System.out.println("No");
	}
}