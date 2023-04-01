package KRISHNA_SUNDEEP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MajorityElements {

//				print the majority elements in an array	
	
	public static void main(String[] args) 
	{
		int [] arr = {10,20,10,10,40};
		int size = arr.length;
		for (int i = 0; i < arr.length; i++) 
		{	
			boolean flag = false;
			int c = 1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] == arr[j])
				{
					c++;
				}
				if(c > size / 2)
				{
					flag = true;
				}
			}
			if(flag == true)
			{
				System.out.println(arr[i]+" is majority element");
			}
		}
	}
}
