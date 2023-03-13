package COLLECTION;

import java.util.ArrayList;

public class ArrayLists 
{
//								add 5 emp names	
	
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Rick");
		a1.add("Almas");
		a1.add("Hari");
		a1.add("Pravin");
		a1.add("Triveni");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		System.out.println(a2);
	}
}
