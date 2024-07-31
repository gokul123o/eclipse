package sample;

public class Addi {
	static int a=10;
	static int b=20;
	public static void add()
	{
		int add=a+b;
		System.out.println("Sum= "+add);
	}
	public static void avg()
	{
		int avg=(a+b)/2;
		System.out.println("Average= "+avg);
	}
	public static void main()
	{
		Addi.add();
		Addi.avg();
	}
}
