package STRING;

import java.util.Scanner;

public class NameUppLow 
{

/*		take a name from user and print in such way if the char is in odd 
		index make it lowercase and if the char is in even index then make it
		uppercase */
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(i % 2 == 0)
			{	
				char c = s.charAt(i);
				int n = (int)c-32;
				char c1 = (char) n;
				System.out.print (c1+" ");
			}
			else
				System.out.print(s.charAt(i)+" ");
		}
	}
}
