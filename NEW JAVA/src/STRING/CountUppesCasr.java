package STRING;

import java.util.Scanner;

public class CountUppesCasr {

//					count uppercase char in a string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				count++;
			}
		}
		System.out.println("Number of uppercase char are "+count);
	}
}
