package homework_6;

import java.util.Scanner;

public class Whileloop {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Write a Java program that takes a number as input and prints its multiplication table up to 10.
			Scanner keyboard = new Scanner(System.in);
			 System.out.println("Input the Number: ");
			 int n = keyboard .nextInt();
			  int i =1;
			  while (i <= 10) {
			   System.out.println(n + "*" + i + " = " + (n * i));
			   i++;
			
			
		}
		}}

	


