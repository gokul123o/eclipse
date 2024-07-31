package sample;

public class Def {
	static int sum,c,d;
	public static void main(String args[]) 
	{
		Def.add(50,50);
		Def.disp();
		
		
	}
	public static void add(int a,int b)
	{
		c=a;
		d=b;
		
	}
	public static void disp()
	{
		sum=c+d;
		System.out.println(sum);
	}

}
