package constructor;

public class Customer {
	static int total,dis,c,k;
	public static int items(int i1,int i2,int i3)
	{
		total=i1+i2+i3;
		return total;
	}
	public static void disc()
	{
		if(k>=5000)
		{
			dis=k*20/100;
			System.out.println(dis);
			System.out.println("Discount: "+dis);
		}
		else
		{
			System.out.println("No discount");
		}
	}
	public static void main(String[] args) {
		int c=Customer.items(1000, 3000, 4000);
		k=total;
		System.out.println(c);
		Customer.disc();
	
		
		
		
		
	}
}
