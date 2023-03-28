package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

//					check the string is pangram or not
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter a string");
		String s = "the quick brown fox jumps over a lazy dog";//sc.nextLine().toLowerCase();
		s = s.replace(" ", "");
		char [] ch1 = s.toCharArray();
		Arrays.sort(ch1);
		String visit = "";
		for (int i = 0; i < ch1.length; i++)
		{
			char c = ch1[i];
			if(visit.indexOf(c) == -1)
			{
				if(c >= 'a' && c <= 'z')
				{
					visit += c;
				}
			}
		}
		char c2 = 'a';
		for (int i = 0; i < visit.length(); i++)
		{
			char c1 = visit.charAt(i);
			if(c1 == c2)
			{
				c2++;
			}
			else
			{
				System.out.println("Its not a Panagram");
				System.exit(0);
			}
		}
		System.out.println("It's a Pangram");
	}
}
