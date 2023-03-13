package STRING;

import java.util.Scanner;

public class EmailValidation {

//			Check the given string is valid or not with an @ and a domain
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
		{
			if(s.endsWith(".com") || s.endsWith(".org") || s.endsWith(".in"))
			{
				if(s.contains("@"))
				{
					System.out.println("It's a valid Email Id");
				}
			}
		}
		else
			System.out.println("Enter a valid Email Id");
	}
}
