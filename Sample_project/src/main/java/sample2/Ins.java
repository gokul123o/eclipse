package sample2;

import java.util.Arrays;

public class Ins {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int newarr[]=new int[n+1];
		int value =7;
		int pos=3;
		int j=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
			if(i==pos)
			{
				newarr[i]=value;
			}
			else
			{
				newarr[i]=arr[j];
				j++;
			}
		}
		newarr[pos]=value;
		System.out.println(Arrays.toString(newarr));
	}

}
