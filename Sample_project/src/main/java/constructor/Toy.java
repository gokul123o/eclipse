package constructor;

public class Toy {
	int s,c,d;
	public void sum(int a,int b)
	{
		c=a;
		d=b;
		s=c+d;
		System.out.println("sum= "+s);
	}
	
	public void avg()
	{
		int avg=s/2;
		System.out.println("Average= "+avg);
	}
	public static void main(String args[])
	{
		Toy k=new Toy();
		k.sum(30,20);
		k.avg();
	}
}
