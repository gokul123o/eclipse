package constructor;

public class Insta {
	public void dis()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		Insta t= new Insta();
		for(int i=1;i<=5;i++)
		{
			t.dis();
		}
	}
}
