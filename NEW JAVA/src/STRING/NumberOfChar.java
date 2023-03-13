package STRING;

import java.util.Scanner;

public class NumberOfChar {

	
//						number of char in given string
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int count = 0;
		System.out.println(s.length()+" char present");
		System.out.println("===================");
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			count++;
		}
		System.out.println(count+" char present");
	}
}
