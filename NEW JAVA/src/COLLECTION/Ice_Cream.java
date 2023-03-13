package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class Ice_Cream {

//						print using iterator method
	
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Vanila");
		a1.add("Cornato");
		a1.add("Chocolate");
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
