package STRING;

import java.util.Scanner;

public class StringPalindrome {
	
//								string palindrome

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.nextLine().toLowerCase();
		s = s.replace(" ", "");
		String rev = "";
		for(int i = s.length()-1 ; i >= 0 ; i--)
		{
			rev += s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("It's a palindrome");
		}
		else
			System.out.println("It's not a palindrome");
	}
}
