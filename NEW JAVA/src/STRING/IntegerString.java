package STRING;

import java.util.Scanner;

public class IntegerString {

//			  verify if a string contains only integer elements	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.nextLine().toLowerCase();
		char [] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i] >= '0' && c[i] <= '9');
			else
			{
				System.out.println("Not an integer string ");
				System.exit(0);
			}
		}
		System.out.println("It's an integer string ");
	}
}
