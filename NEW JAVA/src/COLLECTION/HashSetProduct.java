package COLLECTION;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetProduct {

//						product of hashSet elements
	
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet();
		h1.add(5);
		h1.add(4);
		h1.add(3);
		h1.add(2);
		h1.add(1);
		
//							using array		
		
		int prod = 1;
		Integer [] arr =  h1.toArray(new Integer [h1.size()]);
		for (int i = 0; i < arr.length; i++) 
		{
			prod = prod * arr[i];
		}
		System.out.println(prod);
		
//							using for each loop	
		
		int prod1=1;
		for(int i:h1)
		{
			prod1=prod1*i;
		}
		System.out.println(prod1);
	}
}
