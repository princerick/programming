package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class NextGreaterElement {

//				print the next greater element of each element
	
	public static void main(String[] args) 
	{
		int [] arr = {10,11,5,4,7};
		int [] b = new int [arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = false;
			int j = 0;	
			for (j = i+1; j < arr.length; j++) 
			{
				if(i != arr.length-1)
				{
					if(arr[j] > arr[i])
					{
						flag = true;
						break;
					}
					else
					{
						flag = false;
					}
				}
			}
			if(flag == true)
			{
				System.out.println(arr[i]+"  "+(arr[j]));
			}
			else
			{
				System.out.println(arr[i]+"  "+-1);
			}
		}
	}
}
