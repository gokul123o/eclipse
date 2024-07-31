package single;

public class Child extends Sub {
	void display()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.d();
		c.dis();
		c.display();
		
	}

}
