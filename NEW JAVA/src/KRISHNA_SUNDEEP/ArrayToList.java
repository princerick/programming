package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

//					Convert an array to an arraylist
	
	public static void main(String[] args) 
	{
		String [] s = {"black", "blue", "red"};
		
//		List l1 = Arrays.asList(s);
//		System.out.println(l1);
		
		List <String> l2 = new ArrayList <> ();
//		Collections.addAll(l2, s);
//		System.out.println(l2);
		
		for(String s1 : s)
		{
			l2.add(s1);
		}
		System.out.println(l2  );
	}
}
