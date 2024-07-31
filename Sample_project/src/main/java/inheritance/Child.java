package inheritance;

public class Child extends Parent{
	int dif;
	public void sub()
	{
		dif=a-b;
		System.out.println(dif);
	}
	public static void main(String[] args) {
		Child i=new Child();
		i.add();
		i.sub();
		
	}

}
