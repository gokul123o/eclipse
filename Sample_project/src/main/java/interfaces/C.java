package interfaces;

public class C implements A,B{

	
	public void sum() {
		int sum=a+b;
		System.out.println("Sum :"+sum);
		
		
	}

	public void sub() {
		int sub=x-y;
		System.out.println("Sub :"+sub);
		
		
	}
	public static void main(String[] args) {
		C i=new C();
		i.sum();
		i.sub();
	}

}
