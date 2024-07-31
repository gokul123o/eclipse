package exceptionns;

public class Throwss {
	int age=16;
	public void eli() throws VoteException
	{
		if(age>18)
		{
			System.out.println("Eligibile to vote");
		}
		else
		{
			throw new VoteException("Invalid Age");
		}
	}
	public static void main(String[] args) throws VoteException {
	Throwss c=new Throwss();
	c.eli();
	}
	

}
