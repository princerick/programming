package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

//					check wheather the two string is anagram
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string");
		String s2 = sc.nextLine();
		if(s1.length() != s2.length())
		{
			System.out.println("It's not an anagram");
		}
		else
		{
			boolean flag = isAnagram(s1,s2);
			if(flag == true)
			{
				System.out.println("It's an anagram");
			}
			else
			{
				System.out.println("It's not an anagram");
			}
		}
	}
	static boolean isAnagram (String s1, String s2)
	{
		
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean flag = false;
		for (int i = 0; i < c1.length; i++) 
		{
			if(c1[i] == c2[i])
			{
				flag = true;
			}
			else 
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}
