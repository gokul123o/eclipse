package constructor;

public class Insover {
	static int sum1,sum2;
	public void run(int a,int b)
	{
		sum1=a+b;
		System.out.println("Sum="+sum1);
	}
	public void run(int a,int b,int c)
	{
		sum2=a+b+c;
		System.out.println("Sum="+sum2);
	}
	public void run(String name)
	{
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {
		Insover j=new Insover();
		j.run(10,20);
		j.run(40,30,20);
		j.run("Arun");
	}
	

}
