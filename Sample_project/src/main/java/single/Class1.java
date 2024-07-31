package single;

import java.util.Scanner;

public class Class1 {
	float basicpay,deduction,bonus;
	void get()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic pay: ");
	basicpay=sc.nextFloat();
	System.out.println("Enter deduction: ");
	deduction=sc.nextFloat();
	System.out.println("Enter bonus: ");
	bonus=sc.nextFloat();
	}
	

}
