package constructor;

public class Addc {
	int a=10;
	int b=20;
	public Addc()
	{
		int sum=a+b;
		System.out.println("Sum= "+sum);
	}
	public static void main(String args[])
	{
		Addc j=new Addc();
	}
	

}
