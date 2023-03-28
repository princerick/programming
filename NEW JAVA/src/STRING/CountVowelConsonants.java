package STRING;

import java.util.Scanner;

public class CountVowelConsonants {

//	count number of vowels, consonants and Special char present in the string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		int vowel = 0;
		int  con = 0;
		int sp = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch >= '0' && ch <= '9');
			else
			{
				if(ch >= 'a' && ch <= 'z')
				{
					if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					{
						vowel++;
					}
					else
					{
						con++;
					}
				}
				else
				{
					sp++;
				}	
			}
		}
		System.out.println("Number of vowel present is "+vowel);
		System.out.println("Number of consonant present is "+con);
		System.out.println("Number of special char present is "+sp);
	}
}
