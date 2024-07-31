package sample2;

public class Nonabs extends Abstra{

	public void di() {
		System.out.println("Abstract class");
		
		
	}
	public static void main(String[] args) {
		Nonabs c=new Nonabs();
		Abstra.disp();
		c.di();
	}
	

}
