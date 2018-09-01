/** This is just a simple calculation of money and display the original price,
 *  discount, and discounted amount .
 *  It consist of code to be input by user to perform the action.
 *  
 *  @author				Freda Chew Chen Pei
 *  Matriculation no  	P15006156
 *  Date 				9-5-16

*/
import java.util.Scanner; // to allow show input and output
import java.text.DecimalFormat;//Set the decimal to be display

public class Lab_Objectives {
	
	public static void main(String args[]){ //main method
		
		DecimalFormat doublePattern = new DecimalFormat("0.00"); // to change all number to 2 decimal place
		
		double amount, discount = 0; // initialization
		String alp; //initialization
		
		Scanner money = new Scanner(System.in);//input 
		System.out.println("Please enter price :");//show message
		
		amount = money.nextDouble();
		
		System.out.println("Please enter pricing code :");//show message
		
		Scanner alphabet = new Scanner(System.in);//input 
		
		alp = alphabet.nextLine();
		
		switch(alp){
		
			case"H":
			case"h":
				System.out.println("Original Price \t\t: RM " + doublePattern.format(amount));//amount before discount
				discount =(amount*0.5); //discount
				amount = (amount*0.5);//amount after discount
				System.out.println("Discount \t\t: RM "+doublePattern.format(discount));//output discount
				System.out.println("Discounted Amount \t: RM "+doublePattern.format(amount));//output discounted amount
				
				break;
			
			case"F":
			case"f":
				System.out.println("Original Price \t\t: RM " + doublePattern.format(amount));//amount before discount
				discount = (amount*0.4);//discount
				amount = (amount*0.6);//amount after discount
				System.out.println("Discount \t\t: RM "+doublePattern.format(discount));//output discount
				System.out.println("Discounted Amount \t: RM "+doublePattern.format(amount));//output discounted amount
				
				break;
			
			
			case "T":
			case"t":
				System.out.println("Original Price \t\t: RM " + doublePattern.format(amount));//amount before discount
				discount = (amount*0.33);//discount
				amount = (amount*0.67);//amount after discount
				System.out.println("Discount \t\t: RM "+doublePattern.format(discount));//output discount
				System.out.println("Discounted Amount \t: RM "+doublePattern.format(amount));//output discounted amount
				
				break;
			
			case "Q":
			case "q":
				System.out.println("Original Price \t\t: RM " + doublePattern.format(amount));//amount before discount
				discount = (amount*0.25);//discount
				amount = (amount*0.75);//amount after discount
				System.out.println("Discount \t\t: RM "+doublePattern.format(discount));//output discount
				System.out.println("Discounted Amount \t: RM "+doublePattern.format(amount));//output discounted amount
				
				break;
			
			case"Z":
			case"z":
				System.out.println("Original Price \t\t: RM " + doublePattern.format(amount));//amount before discount
				amount = (amount*1);//amount after discount
				System.out.println("No Discount");//no discount is shown
				
				break;
			
			default:
				System.out.println("Original Price \t\t: RM " + doublePattern.format(amount));//amount before discount	
				System.out.println("Invalid price code");//there is no input code H,F,T,Q,Z available
				
				break;
		
		}//end switch
		
		
		
		
	}//end main

}//end class
