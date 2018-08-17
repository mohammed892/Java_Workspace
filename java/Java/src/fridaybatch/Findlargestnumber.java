package fridaybatch;

import java.util.Scanner;

public class Findlargestnumber {

	public static void main(String[] args) {
		// Write a program called FindLargestNumber which takes 5 numbers from the user and find the

//largest number among them.
	

				Scanner Keyboard=new Scanner(System.in);
			    System.out.println("Enter first number: ");
			     double n1 = Keyboard.nextDouble();
			     System.out.println("Enter second number: ");
			     double n2 = Keyboard.nextDouble();
			     System.out.println("Enter third number: ");
			     double n3 = Keyboard.nextDouble();
			     System.out.println("Enter Fourth number: ");
			     double n4 = Keyboard.nextDouble();
			     System.out.println("Enter fifth number: ");
			     double n5 = Keyboard.nextDouble();
			     
			   
			     double largest = Math.max(n1, Math.max(n2,n3, Math.max(n4, n5)));
			   
			     System.out.println("Smallest among (" + n1 + ", " + n2 + ", " + n3 + ", "+  n4 + ", " + n5 + ") is: " 
			                                     + largest);
			  
			  }
			}

