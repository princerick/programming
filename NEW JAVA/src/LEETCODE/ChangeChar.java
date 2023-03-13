package LEETCODE;

import java.util.Scanner;

public class ChangeChar {

	/* WAP to reverse a string and modify it according 
	   	to the constraints given:
		std input:  zoo		std input:  Zack
		std output: app		std output: Abdl

	   Take the input from the user.
	   Print the reversed string as well as modified string.*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String rev = "";
		char ch1 = ' ';
		for (int i = s.length() - 1; i >= 0; i--) 
		{
			rev += s.charAt(i);
		}
		System.out.println(rev);
		char ch [] = new char [s.length()];
		for (int i = 0; i < rev.length(); i++) 
		{
			if(rev.charAt(i) >= 'A' && rev.charAt(i) < 'Z' || rev.charAt(i) >= 'a' && rev.charAt(i) < 'z')
			{
				ch1 = (char) (rev.charAt(i) + 1);	
			}
			else if (rev.charAt(i) == 'Z' ||rev.charAt(i) == 'z')
			{
				ch1 = (char) (rev.charAt(i)-25);
			}
			ch[i] = ch1;
		}
		for (int i = 0 ; i < ch.length ; i++) 
		{
			System.out.print(ch[i]);
		}
	}
}
