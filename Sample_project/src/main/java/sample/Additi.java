package sample;

public class Additi {
	static int a=10;
	static float b=20.5f;
	public static float add()
	{
		float sum=a+b;
		return sum;
	}
	public static void main(String args[])
	{
		//System.out.println("sum of two numbers is : "+Additi.add());
		float k=Additi.add();
		System.out.println("sum is :"+k);
	}

}
 