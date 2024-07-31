package classs;

import java.util.Arrays;

public class Tesst {
	public static int disp(int n,int[] arr)
	{
		if (n>2)
		{
			return -1;
		}
		Arrays.sort(arr);
		int size=arr.length;
		for(int i=0;i<=size;i++)
		{
			if(arr[i]<arr[i+1])
			{
				return arr[i];
			}
			
		}
		return -1;
		
	}

}
