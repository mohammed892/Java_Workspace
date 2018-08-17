package practice;

import java.util.Scanner;

public class Annualincome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		double income;
		// craete a scanner for the object
		Scanner keyboard = new Scanner(System.in);
		
		// get the user age
		
		System.out.println("what is your age");
		age = keyboard.nextInt();
		
		System.out.println("what is your income");
		income =keyboard.nextDouble();
		
		System.out.println("what is your name");
		name =keyboard.nextLine();
	
		
		System.out.println("hello,"+ name + ".your age is " +age + "and your income is $" +income);
		

	}

}
