package constructor;
public class Sg {
	int x,y,z;
	static int tot;
	static char g;
	public int mark()
	{
		tot=x+y+z;
		return tot;
	}
	public void grade(char g)
	{
		System.out.println("Grade = "+g);
	}
	public Sg(int m1,int m2,int m3)
	{
		x=m1;
		y=m2;
		z=m3;	
}
	public static void main(String[] args) {
		Sg s=new Sg(50,25,20);
		Sg s1=new Sg(30,25,25);
		s.mark();
		System.out.println("Total mark of first student = "+tot);
		s.grade('A');
		System.out.println();
		s1.mark();
		System.out.println("Total mark of second student = "+tot);
		s1.grade('B');	
	}
}
