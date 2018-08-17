package fridaybatch;

import java.util.Scanner;

public class Checkodd {

	public static void main(String[] args) {
		//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is
		//odd, or “Even Number” otherwise. The program shall always print “BYE!” before exiting.
		//n is an even number if (n % 2) is 0; otherwise, it is an odd number.
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter a number");
		int i = keyboard.nextInt();
		
		if (i%2==0)
			System.out.println("this is even number" );
	
		else 
			System.out.println("this is odd number");
		System.out.println("BYE!");
			

}}
