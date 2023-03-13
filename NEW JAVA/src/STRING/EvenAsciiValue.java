package STRING;

import java.util.Scanner;

public class EvenAsciiValue {

	
//						count char with even ascii value
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			int n = s.charAt(i);
			if(n % 2 == 0)
			{
				count++;
			}
		}
		System.out.println(count+" char are present with even ascii value");
	}
}
