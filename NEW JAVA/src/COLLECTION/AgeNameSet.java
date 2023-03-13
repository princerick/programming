package COLLECTION;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AgeNameSet {

//						print details of even age using Mapping
	
//	public static void main(String[] args) 
//	{
//		HashMap <String, Integer> h1 = new HashMap <String, Integer>();
//		h1.put("Rick", 22);
//		h1.put("Hari", 23);
//		h1.put("Praveen", 24);
//		for(Entry e : h1.entrySet())
//		{
//			int age = (int) e.getValue();
//			if(age % 2 == 0)
//			{
//				System.out.println(e.getKey()+" "+e.getValue());
//			}
//		}
//	}
	
//						print details of even age using Set
	
	public static void main(String[] args) 
	{
		LinkedHashSet h1 = new LinkedHashSet();
		Scanner sc = new Scanner(System.in); 
		int age = 0;
		String name = "";
		boolean flag = true;
		while( flag)
		{
			System.out.println("Welcome...Do you want to continue!(Y) or exit!(N)");
		    String s = sc.nextLine().toUpperCase();
			if(s.equals("Y"))
			{
				System.out.println("Enter the name");
				name = sc.nextLine();
				h1.add(name);
				System.out.println("Enter the age");
				age = sc.nextInt();
				h1.add(age);
				sc.nextLine();
			}
			else
			{
				Iterator itr = h1.iterator();
				while(itr.hasNext())
				{
					name = (String) itr.next(); 
					age = (int) itr.next();
					if(age % 2 == 0)
					{
						System.out.println(name+" "+age);
					}
				}
				flag = false;
			}
		}
	}
}
