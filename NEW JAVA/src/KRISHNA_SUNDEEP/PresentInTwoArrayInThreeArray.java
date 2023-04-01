package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PresentInTwoArrayInThreeArray {

// check whether an element is present at least in two arrays out of  three arrays
	
	public static void main(String[] args) 
	{
		Integer [] a = {1,2,3,9,8,7};
		Integer [] a1 = {4,1,2,10,15};
		Integer [] a2 = {5,1,2,4,10};
		HashSet h1 = new HashSet();
		List l1 = Arrays.asList(a);
		List l2 = Arrays.asList(a1);
		List l3 = Arrays.asList(a2);
		h1.addAll(l1);
		h1.addAll(l2);
		h1.addAll(l3);
		System.out.println(h1);
		List f1 = new ArrayList <>();
		for (Object o1 : h1) 
		{
			if((l1.contains(o1) && l2.contains(o1)) || (l1.contains(o1) && l3.contains(o1)) || (l2.contains(o1) && l3.contains(o1)))
			{
				f1.add(o1);
			}
		}
		System.out.println(f1);
	}
}
