package STRING;

import java.util.Scanner;

public class CcountLowercaseSpecial {

//				count lowercase and special char in a string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int loc = 0;
		int sp = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z');
			else if (ch >= '0' && ch <= '9');
			else if (ch >= 'a' && ch <= 'z')
			{
				loc++;
			}
			else
				sp++;
			
		}
		System.out.println("Number of lowercase and special char are "+loc+" and "+sp);
	}
}
