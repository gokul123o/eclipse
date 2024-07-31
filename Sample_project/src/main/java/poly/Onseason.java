package poly;

import java.util.Scanner;

public class Onseason extends Offseason{
	void discount(int bill)
	{
		int discount;
		discount=bill*40/100;
		System.out.println("Discount: "+discount);
		super.discount(bill);
	}
	public static void main(String[] args) {
		Onseason c=new Onseason();
		char val;
		System.out.println("Enter value: ");
		Scanner sc=new Scanner(System.in);
		val=sc.next().charAt(0);
		if(val=='f')
		{
			System.out.println("Off season Discount Available");
			c.discount(3000);
		}
		else if(val=='o')
		{
			System.out.println("On season discount available");
			c.discount(3000);
		}
		else 
		{
			System.out.println("No discount");
		}
		
	}

}
