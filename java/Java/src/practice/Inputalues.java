package practice;

import java.util.Scanner;

public class Inputalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int hours;
		double rate;
		double grosspay;
		//create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		//get the user name
		System.out.println("what is your name");
		name = keyboard.nextLine();
		//get the hours
		System.out.println("how many hours did you work");
		hours = keyboard.nextInt();
		
		// vget the rate
		
		System.out.println("what is pay rate");
		rate = keyboard.nextDouble();
		
		// get the gross pay rate
		
		
		grosspay  = hours * rate;
		
		System.out.println("hello, " + name );
		System.out.println("your grosspay is $" + grosspay );
		

	}

}
