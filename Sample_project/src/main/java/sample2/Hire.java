package sample2;
import java.util.* ;
import java.io.*; 
public class Hire {
	static int i,n,sum;
	public static long evenSumTillN(int n) {
		for(i=0;i<=n;i++)
		{
			if(n%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		evenSumTillN(6);
	}
}

