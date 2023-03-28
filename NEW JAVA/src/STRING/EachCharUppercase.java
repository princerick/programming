package STRING;

import java.util.Scanner;

public class EachCharUppercase {

//	convert every char of each word into uppercase without in-built method	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.nextLine().toLowerCase();
		char [] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i] != ' ')
			{
				c[i] = (char) (c[i] - 32);
			}
		}
		System.out.println(c);
	}
}
