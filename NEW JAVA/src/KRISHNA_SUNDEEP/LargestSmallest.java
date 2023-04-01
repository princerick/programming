package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class LargestSmallest {

//				find largest and smallest element in an array	
	
	public static void main(String[] args) 
	{
		int [] a = {1, 100, 2, 20, 30, 50};
		
//						without using in-built method
		
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println(max+" is largest element");
		System.out.println(min+" is smallest element");
		
//						using in-built method
		
		Arrays.sort(a);
		System.out.println(a[a.length-1]+" is largest element");
		System.out.println(a[0]+" is smallest element");
	}
}
