package constructor;

public class Gra {
	static int total,mark1,mark2,mark3,t;
	public Gra(int m1,int m2,int m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
		
		
	}
	public int tota()
	{
		total=mark1+mark2+mark3;
		return total;
	}
	public void grade()
	{
		
		if(total>=270 )
		{
			System.out.println("A");
		}
		else if(total<=269 && total>=240)
		{
			System.out.println("B");
		}
		else if(total<=239 && total>=180)
		{
			System.out.println("C");
		}
		else if(total<=170 && total >=120)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	public static void main(String args[])
	{
		
		Gra j=new Gra(80,69,88);
		System.out.println("Mark of student 1: "+j.tota());
		System.out.print("Grade of student 1: ");
		j.grade();

		Gra i=new Gra(90,90,90);
		System.out.println("Mark of student 2: "+j.tota());
		System.out.print("Grade of student 2: ");
		i.grade();
		
		
	}

}
