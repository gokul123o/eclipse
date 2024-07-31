package constructor;

public class Cardetails {
	int bonusmark=8;
	static int bonus_salary=2000,Feb_ins_amo=1000;
	public void studentdetails(String Sname,int age,int Firstmark,char grade)
	{
		System.out.println("-----------STUDENT DETAILS--------------");
		System.out.println("Student Name :"+Sname);
		System.out.println("Age :"+age);
		System.out.println("1st sem mark:"+Firstmark);
		System.out.println("Grade :"+grade);
		int Tmark=Firstmark+bonusmark;
		System.out.println("Total mark: "+Tmark);
		System.out.println("-----------------------------------------");
	}
	public void employeedetails(String ename,String Eid,int Jansal)
	{
		System.out.println("-----------EMPLOYEE DETAILS--------------");
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Id : "+Eid);
		System.out.println("January salary : "+Jansal);
		int Totalsal=Jansal+bonus_salary;
		System.out.println("Total salary: "+Totalsal);
		System.out.println("-----------------------------------------");
		
		
	}
	public Cardetails(String Cname,int Jan_ins_amount)
	{
		System.out.println("------------CAR DETAILS------------");
		System.out.println("Car Name:"+Cname);
		System.out.println("January insurance amount :"+Jan_ins_amount);
		int Total=Feb_ins_amo+Jan_ins_amount;
		System.out.println("Total: "+Total);
		System.out.println("-----------------------------------------");
		
	}
	public Cardetails()
	{
		
	}
	public static void main(String args[])
	{
		Cardetails j=new Cardetails();
		j.studentdetails("Arjun",22, 333, 'A');
		j.employeedetails("Kiran", "E2314", 20000);
		Cardetails i=new Cardetails("Honda",20000);
		
	}
}
