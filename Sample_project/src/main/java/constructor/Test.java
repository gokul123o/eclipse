package constructor;

import java.util.Scanner;

public class Test {
	static String name,place,C_name="Obsquare";
	static int id;
	public Test(String name,int id,String place)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id: ");
		id=sc.nextInt();
		this.id=id;
		System.out.println("Enter name: ");
		this.name=name;
		name=sc.nextLine();
		this.place=place;
		System.out.println("Enter place: ");
		place=sc.nextLine();	
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
			Test i=new Test(name,id,place);
			i.Display();
	}


}

