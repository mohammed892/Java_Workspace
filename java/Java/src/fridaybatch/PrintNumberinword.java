package fridaybatch;

import java.util.Scanner;

public class PrintNumberinword {

	public static void main(String[] args) {
		/*

		 * Exercise PrintNumberInWord (nested-if, switch-case): 

		 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,

		 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.

		 * Use (a) a "nested-if" statement; (b) a "switch-case" statement.

		 */
    int number=5;
    useNestedIf(number);

   
 

	
		        switch (number) {

		            case 0:  System.out.println("zero");  
		            break;

		            case 1: System.out.println("one");    
		            break;

		            case 2: System.out.println("Two"); 
		            break;

		            case 3:  System.out.println("THREE"); 
		            break;

		            case 4:  System.out.println("FOUR"); 
		            break;

		            case 5:   System.out.println("FIVE"); 
		            break;

		            case 6:   System.out.println("SIX"); 
		            break;

		            case 7:  System.out.println("SEVEN"); 
		            break;

		            case 8:  System.out.println("EIGHT"); 
		            break;

		            case 9:  System.out.println("NINE"); 
		            break;

		            default: System.out.println("OTHER"); 		        
		            break;

		        }

		        System.out.println(" Use a \"switch-case\" statement: " );

		    }

		    

		
public static void useNestedIf(int number) {
	if (0 == number) {

		if (0 == number) {

            System.out.println("ZERO");

        } else if (1 == number) {

        	System.out.println("ONE");

        } else if (2 == number) {

        	System.out.println("TWO");

        } else if (3 == number) {

        	System.out.println("THREE");

        } else if (4 == number) {

        	System.out.println("FOUR");
        } else if (5 == number) {

        	System.out.println("FIVE");

        } else if (6 == number) {

        	System.out.println("SIX");

        } else if (7 == number) {

        	System.out.println("SEVEN");

        } else if (8 == number) {

        	System.out.println("EIGHT");

        } else if (9 == number) {

        	System.out.println("NINE");

        } else {

        	System.out.println("OTHER");

        }

        System.out.println("(a) Use a \"nested-if\" statement: " );

    }}}


