package STRING;

import java.util.Scanner;

public class DuplicatesChar {

//							duplicate char in a string
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String visit = "";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(visit.indexOf(ch) == -1)
			{
				for (int j = i+1; j < s.length(); j++) 
				{
					if(ch == s.charAt(j))
					{
						System.out.println(ch+" is duplicate here");
						visit += ch;
						break;
					}
				}
			}
			
		}
	}
}
