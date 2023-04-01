package KRISHNA_SUNDEEP;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUniqueElements {

//					print duplicate elements in an array
	
	public static void main(String[] args) 
	{
		int [] a = {2,4,5,7,4,7};
		Set nonDuplicate = new HashSet ();
		Set duplicate = new HashSet ();
		Set unique = new HashSet ();
		for (Integer i : a) 
		{
			if(! nonDuplicate.contains(i))
			{
				nonDuplicate.add(i);
			}
			else
			{
				duplicate.add(i);
			}
		}
		for (Object o : nonDuplicate) 
		{
			if(! duplicate.contains(o))
			{
				unique.add(o);
			}
		}
		System.out.println("Duplicates elements are "+duplicate);
		System.out.println("Unique elements are "+unique);
	}
}
