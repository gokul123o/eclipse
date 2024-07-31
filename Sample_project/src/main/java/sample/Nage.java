package sample;

public class Nage {
	static String name;
	static int age;
	public static void name()
	{
		name="Gokul";
		age=19;	
	}
	public static void display()
	{
		System.out.println("name is "+name+" and age is "+age);
	}
	public static void main(String args[])
	{
		Nage.name();
		Nage.display();
	}

}
