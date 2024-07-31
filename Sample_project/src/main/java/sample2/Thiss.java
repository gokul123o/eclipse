package sample2;

public class Thiss {
	int a,b;
	Thiss(int a,int b)
	{
		this();
		this.a=a;
		this.b=b;
		this.sum();
		
	}
	Thiss()
	{
		System.out.println("default constructor called");
	}
	void sum()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		Thiss c=new Thiss(10,20);
		//c.sum();
	}

}
