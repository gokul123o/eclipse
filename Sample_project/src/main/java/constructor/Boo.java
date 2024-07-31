package constructor;

public class Boo {
	static int a=21;
	static boolean s;
	public static boolean votes()
	{
		if (a>=18)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		s=Boo.votes();
		System.out.println(s);
	}

}
