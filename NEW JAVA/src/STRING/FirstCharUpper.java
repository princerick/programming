package STRING;

import java.util.Scanner;

public class FirstCharUpper {

//	convert first char of each word into uppercase without in-built method
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.nextLine().toLowerCase();
		char [] c = s.toCharArray();
		c[0] = (char) (c[0] - 32);
		for (int i = 1; i < c.length; i++) 
		{
			if(c[i] == ' ')
			{
				c[i+1] = (char) (c[i+1] - 32);
			}
		}
		System.out.println(c);
	}
}
