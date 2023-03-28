package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MarksCard {

//				both the subjects of pu1 and pu2 are same or not
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject studied in class 11");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String s4 = sc.nextLine();
		String s5 = sc.nextLine();
		ArrayList pu1 = new ArrayList();
		pu1.add(s1);
		pu1.add(s2);
		pu1.add(s3);
		pu1.add(s4);
		pu1.add(s5);
		
		System.out.println("Enter the subject studied in class 12");
		String s6 = sc.nextLine();
		String s7 = sc.nextLine();
		String s8 = sc.nextLine();
		String s9 = sc.nextLine();
		String s10 = sc.nextLine();
		ArrayList pu2 = new ArrayList();
		pu1.add(s6);
		pu1.add(s7);
		pu1.add(s8);
		pu1.add(s9);
		pu1.add(s10);
		
//								task 1		
		
//							using if condition		
		boolean flag = false;
		for (int i = 0; i < pu1.size(); i++) 
		{
			for (int j = 0; j < pu2.size(); j++) 
			{
				if(pu1.get(i).equals(pu2.get(j)))
				{
					flag = true;
					break;
				}
				else
				{
					flag = false;
				}
			}
		}
		if(flag == true)
		{
			System.out.println("Pu1 and Pu2 subjects are same"); 
		}
		else
		{
			System.out.println("Pu1 and Pu2 subjects are different");
		}
		
//								task 1
		
		if(pu2.containsAll(pu1) )
		{
			System.out.println("Pu1 and Pu2 subjects are same");
		}
		else
		{
			System.out.println("Pu1 and Pu2 subjects are different");
		}
		
		
		
//								task 2
		
		ArrayList pu3 = new ArrayList();
//		pu3.addAll(pu1);
//		pu3.addAll(pu2);
		System.out.println(pu3);
		System.out.println("Total subjects are learnt is "+pu3.size());
	}
}
