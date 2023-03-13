package STRING;

import java.util.Scanner;

public class CountVowelConsonants {

//		count number of vowels and consonants present in the string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		int count = 0;
		int  count1 = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
			else
				count1++;
		}
		System.out.println("Number of vowel present is "+count);
		System.out.println("Number of consonant present is "+count1);
	}
}
