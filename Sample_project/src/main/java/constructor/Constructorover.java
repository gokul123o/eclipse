package constructor;

public class Constructorover {
	static int sum,sum3;
	public Constructorover(int a,int b)
	{
		sum=a+b;
		System.out.println("Sum= "+sum);
	}
	public Constructorover(int a,int b,int c)
	{
		sum3=a+b+c;
		System.out.println("Sum of 3 numbers : "+sum3);
	}
	public Constructorover(String name)
	{
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {
		Constructorover j=new Constructorover(10,20);
		Constructorover i=new Constructorover(10,20,30);
		Constructorover k=new Constructorover("Gopumol");
	}

}
