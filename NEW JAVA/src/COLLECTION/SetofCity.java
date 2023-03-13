package COLLECTION;

import java.util.HashSet;

public class SetofCity {

//				    	create set of 5 city names	
	
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add("Kolkata");
		h1.add("Delhi");
		h1.add("Bangalore");
		h1.add("Mumbai");
		h1.add("Chennai");
		for(Object o : h1)
		{
			System.out.println(o);
		}
	}
}
