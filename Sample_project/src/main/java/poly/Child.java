package poly;

public class Child extends Parent {
	public void display(int a,int b)
	{
		int sub;
		sub=b-a;
		System.out.println(sub);
		super.display(a,b);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.display(10,20);
	}
	

}
