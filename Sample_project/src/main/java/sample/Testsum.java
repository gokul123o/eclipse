package sample;

public class Testsum {
	static int a=20;
	static int b=10;
	public static void sum()
	{
		int sum=a+b;
		System.out.print("sum= "+sum);
		System.out.println();
	}
	public static void sub()
	{
		int sub=a-b;
		System.out.println("sub= "+sub);
		System.out.println();
	}
	public static void mul()
	{
		int mul=a*b;
		System.out.println("mul= "+mul);
		System.out.println();
	}
	public static void div()
	{
		int div=a/b;
		System.out.println("div= "+div);
		System.out.println();
	}
	public static void main(String args[])
	{
		Testsum.sum();
		Testsum.sub();
		Testsum.mul();
		Testsum.div();
	}

}
