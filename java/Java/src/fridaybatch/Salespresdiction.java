package fridaybatch;

public class Salespresdiction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The East Coast sales division of a company generates 62 percent of total sales. 
		//Based on that percentages, write a program that will predict how much the East Coast division will
		//generate if the company has $4.6 million in sales this year.
		
		double salespercentage = .62;
		double totalsales = 4600000;
		//total revenue from sales division if sales $4.6 million
		double revenue = totalsales* salespercentage;
		
		System.out.println(revenue);
		
		

	}

}
