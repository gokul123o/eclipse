package Abstract1;

public class Test2 extends Test1{
	public static void main(String[] args) {
		Test2 i=new Test2();
		i.sum(10,20);
		i.sub(20,30);
	}
	public void sub(int k,int j) {
		int sub=k-j;
		System.out.println("Sub is: "+sub);
		
		
	}

}
