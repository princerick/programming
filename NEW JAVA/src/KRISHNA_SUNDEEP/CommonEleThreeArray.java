package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonEleThreeArray {

//				find the common elements in three array
	
	public static void main(String[] args) 
	{
		Integer [] arr1 = {2,3,6,9};
		Integer [] arr2 = {2,4,7,9,3,10};
		Integer [] arr3 = {1,5,2,3,9};
		ArrayList l1 = new ArrayList (Arrays.asList(arr1));
		ArrayList l2 = new ArrayList (Arrays.asList(arr2));
		ArrayList l3 = new ArrayList (Arrays.asList(arr3));
		ArrayList res = new ArrayList();
		Set s1 = new HashSet(l1);
		Set s2 = new HashSet(l2);
		Set s3 = new HashSet(l3);
		int size = (s1.size()>s2.size())?(s1.size()>s3.size()?s1.size():s3.size()):(s2.size()>s3.size()?s2.size():s3.size());
		if(s1.size() == size)
		{
			for(Object i : s1)
			{
				if(s2.contains(i) && s3.contains(i))
				{
					res.add(i);
				}
			}
		}
		else if(s2.size() == size)
		{
			for(Object i : s2)
			{
				if(s1.contains(i) && s3.contains(i))
				{
					res.add(i);
				}
			}
		}
		else
		{
			for(Object i : s1)
			{
				if(s1.contains(i) && s2.contains(i))
				{
					res.add(i);
				}
			}
		}
		System.out.println(res);
	}
}
