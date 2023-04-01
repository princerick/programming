package KRISHNA_SUNDEEP;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElement {

//			print the unique elements in an array	
	
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,20,30,20,40};
		Set s1 = new LinkedHashSet();
		for (int i = 0; i < arr.length; i++) 
		{
			int c = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i] == arr[j])
				{
					c++;
				}
			}
			if(c == 1)
			{
				s1.add(arr[i]);
			}
		}
		System.out.println(s1);
	}
}
