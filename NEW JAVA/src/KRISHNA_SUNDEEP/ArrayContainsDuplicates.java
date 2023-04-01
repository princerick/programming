package KRISHNA_SUNDEEP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainsDuplicates {

//			check whether an array contains duplicates or not
	
	public static void main(String[] args) 
	{
		Integer [] first = {2,3,5,7,2,9,3};
		Integer [] second = {2,3,5,7,9};
		List l1 = Arrays.asList(first);
		List l2 = Arrays.asList(second);
		Set s1 = new HashSet (l1);
		Set s2 = new HashSet (l2);
		if(l1.size() == s1.size())
		{
			System.out.println("first array does not contain duplicates");
		}
		else
		{
			System.out.println("first array contains duplicates");
		}
		
		if(l2.size() == s2.size())
		{
			System.out.println("second array does not contain duplicates");
		}
		else
		{
			System.out.println("second array contains duplicates");
		}

	}
}
