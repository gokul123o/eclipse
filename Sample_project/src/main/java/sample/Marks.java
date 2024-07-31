package sample;

public class Marks {
	public static void main(String args[])
	{
		int mark=80;
		if(mark>=81 && mark<=100)
		{
			System.out.println("A grade");
		}
		else if(mark>=71 && mark<=80)
		{
			System.out.println("B grade");
		}
		else if(mark>=61 && mark<=70)
		{
			System.out.println("C grade");
		}
		else if(mark>=40 && mark<=60)
		{
			System.out.println("D grade");
		}
		else if(mark<40)
		{
			System.out.println("Failed");
		}
		
	}

}
