package sample2;

public class Insert {
	static int pos;
	static int a[]= {1,2,3,4,5};
	static int res[];
	public static void insert()
	{
		for(int i=0;i<pos;i++)
		{
			res[i]=a[i];
		}
		for(int i=pos+1;i<=a.length;i++)
		{
			res[i]=a[i-1];
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		int value;
		Insert.insert();
		
		
	}

}
