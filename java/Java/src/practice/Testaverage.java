package practice;

import java.util.Scanner;

public class Testaverage {

	public static void main(String[] args) {
		int number;
		// create a Scanner object for keyboard input;
		Scanner keyboard= new Scanner(System.in);
		
		// get the numbers 1,2 3 
		System.out.println("enter number 1,2 ,3 ");
		number = keyboard.nextInt();
		
		// determine the  number entered
		    switch (number) {
		    case 1:
		    	System.out.println("you entered 1");
		    case 2:
		    	System.out.println("you entered 2 ");
		    case 3:
		    System.out.println("you entered 3");
		    default:
		    System.out.println("thats not 1 ,2 ,3 ");
		    	
			
		}
		
}}