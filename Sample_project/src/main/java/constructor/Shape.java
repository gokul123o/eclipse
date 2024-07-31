package constructor;

public class Shape {
	static float c,pi=3.14f;
	static int area;
	public void sha(float r)
	{
		c=pi*r*r;
		System.out.println("Area of circle : "+c);
	}
	public void sha(int l,int b)
	{
		area=l*b;
		System.out.println("Area of rectangle: "+area);
	}
	public void sha(int a)
	{
		area=a*a;
		System.out.println("Area of square: "+area);
	}
	public static void main(String args[])
	{
		Shape i=new Shape();
		i.sha(30.2f);
		i.sha(10,20);
		i.sha(10);
	}
}
