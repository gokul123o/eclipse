package single;

public class Class3 extends Class2{
	float totalsalary;
	public void disp()
	{
		totalsalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("*****************************");
		System.out.println("PAYMENT SLIP");
		System.out.println("-------------------------------");
		System.out.println("Total Salary: "+totalsalary);
		System.out.println("Pf: "+pf);
		System.out.println("Basic salary: "+basicpay);
		System.out.println("hra: "+hra);
		System.out.println("Deduction: "+deduction);
		System.out.println("Bonus: "+bonus);
		System.out.println("*******************************");
		
	}
	public static void main(String[] args) {
		Class3 i=new Class3();
		i.get();
		i.cal();
		i.disp();
	}

}
