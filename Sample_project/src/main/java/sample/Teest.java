package sample;

public class Teest {
	static int a=10;
	static int b=20;
	public static void add()
	{
		int add=a+b;
		System.out.println("Sum= "+add);
	}
	public static void sub()
	{
		int sub=a-b;
		System.out.println("substraction= "+sub);
		
	}
	public static void mul()
	{
		int mul=a*b;
		System.out.println("multiplication= "+mul);
	}
	public static void div()
	{
		int div=a/b;
		System.out.println("division= "+div);
	}
	public static void main()
	{
		Teest.add();
		Teest.sub();
		Teest.mul();
		Teest.div();
		
	}
	

}
