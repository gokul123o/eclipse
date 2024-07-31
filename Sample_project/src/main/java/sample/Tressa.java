package sample;

public class Tressa {
	static int a,c,b;
	static int avg;
	public static void sum(int a,int b)
	{
		c=a+b;
		System.out.println("Sum is "+c);
	}
	public static int average()
	{
		avg=c/2;
		return avg;
	}
	public static void main(String args[])
	{
		
		Tressa.sum(60,50);
		int k=Tressa.average();
		System.out.println(k);
		
	}


}
