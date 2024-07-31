package exceptionns;

public class Null {
	public void ex()
	{
		int a=10,b=0;
		int c;
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		Null c=new Null();
		c.ex();
	}

}
 