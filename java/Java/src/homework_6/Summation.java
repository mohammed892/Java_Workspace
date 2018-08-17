package homework_6;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		// Write a Java program that take a number n from the user and print the summation of 1 to n.
		
	Scanner keyboard= new Scanner(System.in);
	System.out.println("enter the number");
    int sum = 0;
   
    	int n = keyboard.nextInt();	
    	while(sum<=n) {
    		sum += n;	
    }
	      
	            System.out.println(sum);
	

	}

}
