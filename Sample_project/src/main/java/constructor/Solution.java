package constructor;

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		float basic,allow,hra,da,pf,total;
		char grade;
		Scanner sc=new Scanner(System.in);
		basic=sc.nextInt();
		grade=sc.next().charAt(0);
		if(grade=='A')
		{
			allow=1700;
		}
		else if(grade=='B')
		{
			allow=1500;
		}
		else
		{
			allow=1300;
		}
		System.out.println(allow);
		pf=basic*11/100;
		hra=basic*20/100;
		System.out.println(hra);
		System.out.println(pf);
		
		da=basic*50/100;
		System.out.println(da);
		total=basic+hra+da+allow-pf;
		System.out.println(total);

		
	}
}