package STRING;

import java.util.Scanner;

public class WordStartingWithVowel 
{

//					number of word starting with vowel
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine().toLowerCase();
		int count = 0;
		int i = 0;
		if(s.charAt(i) != ' ')
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				count++;
			}
		}
		for ( i = 1; i < s.length(); i++) 
		{
			if(s.charAt(i) == ' ' &&  s.charAt(i+1) != ' ')
			{
				i++;
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
				{
					count++;
				}
			}
		}
		System.out.println(count+" words start with vowel");
	}
}
