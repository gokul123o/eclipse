package sample;

public class Defaa {
	static float sum;
	static int a,b;
	public static void main(String args[]) 
	{
		Defaa.add(10,20);
		Defaa.add(10,20,30);
		Defaa.add(20.11f, 20);
		Defaa.add(20.3f, 30.2f);
		
	}
	public static void add(int a,int b)
	{
		sum=a+b;
		System.out.println("add1: "+sum);
	}
	public static void add(int a,int b,int c)
	{
		sum=a+b+c;
		System.out.println("add2: "+sum);
	}
	public static void add(float a,int b)
	{
		sum=a+b;
		System.out.println("add3: "+sum);
	}
	public static void add(float a,float b)
	{
		float s=a+b;
		System.out.println("add4: "+s);
	}

}