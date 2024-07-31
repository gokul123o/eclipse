package exceptionns;

public class Test1 {
	static int age=10;
	public void tu() throws Noteli
	{
		if (age>18)
		{
			System.out.println("eli");
		}
		else
		{
			throw new Noteli("Not");
		}
	}
	public static void main(String[] args) throws Noteli {
		Test1 c=new Test1();
		c.tu();
	}

}
