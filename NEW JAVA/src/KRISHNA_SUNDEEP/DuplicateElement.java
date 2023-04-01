package KRISHNA_SUNDEEP;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

//				print the duplicates in an array using collection	
	
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,20,30,20,40};
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		for (int i = 0; i < arr.length; i++) 
		{
			if(s1.contains(arr[i]) && !s2.contains(arr[i]))
			{
				System.out.println(arr[i]+" is duplicate");
				s2.add(arr[i]);
			}
			else
			{
				s1.add(arr[i]);
			}
		}
	}
}
