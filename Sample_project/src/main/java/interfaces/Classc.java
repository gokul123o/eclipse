package interfaces;

public class Classc implements classA,classB{

	public void su() {
		
		int sum=l+b;
		System.out.println(sum);
		
	}
	public void subs() {
		int sub=h-i;
		System.out.println(sub);
		
	}
	public static void main(String[] args) {
		Classc c=new Classc();
		c.su();
		c.subs();
	}
	

}
