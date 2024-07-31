package exceptionns;

public class Fine {
	public void fina()
	{
		int a=10,b=0;
		
		try {
			int j=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Handled exception");
		}
	}
	public static void main(String[] args) {
		Fine c=new Fine();
		c.fina();
	}

}
