package interfaces;

public class First1 implements First {

	public void sum() {
		int sum=k+j;
		System.out.println("sum: "+sum);
		
		
	}
	public static void main(String[] args) {
		First1 i= new First1();
		i.sum();
		i.sub();
	}
	public void sub() {
		int sub=b-a;
		System.out.println("sub: "+sub);
		
		
	}

}
