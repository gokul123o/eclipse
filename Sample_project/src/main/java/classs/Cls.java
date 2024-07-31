package classs;
import java.util.*;

public class Cls {
	static String name;
	public void names()
	{
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name=s.nextLine();
	}
	public void con()
	{
		if(name=="Arun")
		{
			System.out.println("ple");
		}
	}
	public static void main(String[] args) {
		Cls j=new Cls();
		j.names();
		j.con();
		
	}
}
