package constructor;

public class Para {
	public Para(String s,char a)
	{
		System.out.println(s);
		System.out.println(a);
	}
	public Para(float c,float d)
	{
		float sum=c+d;
		System.out.println("Sum = "+sum);
	}
	public Para()
	{
		System.out.println("default constructor");
	}
	public static void main(String args[])
	{
		Para i= new Para("Hello",'a');
		Para j=new Para(10.2f,20.2f);
		Para k=new Para();
	}

}
