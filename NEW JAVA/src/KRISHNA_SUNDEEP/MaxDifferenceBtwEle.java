package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class MaxDifferenceBtwEle {

//				find the maximum difference between elements
	
	public static void main(String[] args) 
	{
		int max = 0;
		int [] a = {10,20,2,90,40};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				int max1 = a[j] - a[i];
				if(max1 > max)
				{
					max = max1;
				}
			}
		}
		System.out.println("Maximum difference is "+max);
	}
}
