package homework_6;

public class WhileDivisible {

	public static void main(String[] args) {
		//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both

        int i =1;
		System.out.println("Divided by 3: ");		
		while( i<100) {
			if(i%3==0) 
			System.out.print(i +", ");	
			i++;
		
            
		}			
			int j=1;	
		System.out.println("\nDivided by 5: ");
		while (j<100) {
			if (j%5==0) 
				System.out.print(j +", ");	
			j++;
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		while (i<100) {
			if (i%3==0 || j%5==0)
				System.out.print(i +", ");
			i++;
		}
		


	}



	}


