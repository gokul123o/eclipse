package constructor;

public class Avg {
	static int avg;
	static float av;
	public void Avge(int a,int b,int c)
	{
		avg=a+b+c;
		System.out.println(avg);
	}
	public void Avge(float a,float b,float c)
	{
		av=a+b+c;
		System.out.println(av);
	}
	public static void main(String args[])
	{
		Avg i=new Avg();
		i.Avge(10, 20, 30);
		Avg j=new Avg();
		j.Avge(20.3f,30.2f,33.3f);
	}

}
