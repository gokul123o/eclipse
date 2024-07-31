package classs;

public class Over1 extends Over{
		void disp(int a,int b)
		{
			int sub=b-a;
			System.out.println("sub is: "+sub);
			super.disp(a,b);
		}
	public static void main(String[] args) {
		Over1 c=new Over1();
		c.disp(10, 20);
	}

} 
