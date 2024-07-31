package git;

public class B extends A{
	public void display()
	{
		System.out.println("This is class B");
	}
	public static void main(String[] args) {
		B i=new B();
		i.disp();
		i.display();
	}
}
