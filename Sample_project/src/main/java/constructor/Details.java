package constructor;

public class Details {
	static String C_name="Obsquare",name,place;
	static int id;
	
	public Details(String Name1,int id1,String place1)
	{
		name=Name1;
		id=id1;
		place=place1;
		
	}
	public void Display()
	{
		System.out.println("**************STUDENT DETAILS**********");
		System.out.println("Sudent name: "+name);
		System.out.println("Student id: "+id);
		System.out.println("Company Name: "+C_name);
		System.out.println("place name: "+place);
		System.out.println("**************************");
	}
	public static void main(String args[])
	{
		Details i=new Details("Arun",10,"kollam");
		Details j=new Details("Kali",11,"Tvm");
		Details k=new Details("Dayal",12,"klm");
		Details l=new Details("Sanjeev",13,"Tvm");
		Details m=new Details("kiran",14,"klm");
		i.Display();
		j.Display();
		k.Display();
		l.Display();
		m.Display();

	}

}
