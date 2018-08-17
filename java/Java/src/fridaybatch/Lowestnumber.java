package fridaybatch;

import java.util.Scanner;

public class Lowestnumber {

	public static void main(String[] args) {
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
	     
	   
	     double smallest = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, Math.min(n5 )))));
	     System.out.println("Smallest among (" + n1 + ", " + n2 + ", " + n3 + ", "+  n4 + ", " + n5 + ") is: " 
	                                     + smallest);
	  
	  }
	}


