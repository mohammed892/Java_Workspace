package fridaybatch;

import java.util.Scanner;

public class Sumoffivenumbers {

	public static void main(String[] args) {
		/*Write a program that stores the three integers in variables, and stores their sum in a
variable named total. Print the sum.
//NOTE: All the value should be taken from user*/
		int a ;
		int b ;
		int c ;
		int total;
		Scanner keyboard = new Scanner(System.in);
		
		// get value for a
	System.out.println("enter a number for a");
		a = keyboard.nextInt();
		// get a value for b
		System.out.println("enter a number for b");
		b = keyboard.nextInt();
		// get a value c 
		System.out.println("enter a number for c");
		c = keyboard.nextInt();
		
		// total sum
		total = a+b+c;
		
		System.out.println("total sum " + total);
		

	}

}
