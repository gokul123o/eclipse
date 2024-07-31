package sample;

public class Swap_usetemp {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("------Before swapping-------");
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("------After swapping------");
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);		
	}

}
