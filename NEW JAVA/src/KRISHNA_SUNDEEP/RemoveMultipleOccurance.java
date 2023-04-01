package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMultipleOccurance {
 
//				remove  multiple occurrence of an array elements
	
	public static void main(String[] args) 
	{
		int [] arr = {5,1,2,6,4,4,5};
		ArrayList res = new ArrayList();
		for (int i = 0; i < arr.length; i++) 
		{
			if(!res.contains(arr[i]))
			{
				res.add(arr[i]);
			}
		}
		System.out.println(res);
	}
}
