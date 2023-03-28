package STRING;

import java.util.Scanner;

public class Distinct_Char {

//					Print the distinct char present in a string	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine().toLowerCase();
		s = s.replace(" ", "");
		String visit = "";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(visit.indexOf(ch) == -1)
			{
				visit += ch;
			}
		}
		System.out.println(visit);
	}
}
