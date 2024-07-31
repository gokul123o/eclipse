package constructor;

public class Acess {
	public void disp()
	{
		System.out.println("display public");
	}
	private void disp1()
	{
		System.out.println("display1 private");
	}
	protected void disp2()
	{
		System.out.println("display2 protected");
	}
	void disp3()
	{
		System.out.println("display3 default");
	}
	public static void main(String[] args) {
		Acess j=new Acess();
		j.disp();
		j.disp1();
		j.disp2();
		j.disp3();
		
	}

}
