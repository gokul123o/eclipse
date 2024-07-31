package sample;

public class Simp {
	static int a=20;
	static int b=30;
	public static int sum()
	{
		int sum=a+b;
		return sum;
	}
	public static String name()
	{
		String nam="my name is ramu";
		return nam;
	}
	public static void main(String args[])
	{
		System.out.println(Simp.sum());
		System.out.println(Simp.name());
	}
}
