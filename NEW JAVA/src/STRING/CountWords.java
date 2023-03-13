package STRING;

import java.util.Scanner;

public class CountWords {

//					count number of words in a string
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println(isCount (s)+" words are present");
	}
	static int isCount (String s)
	{
		int count = 1;
		if(s.charAt(0) == ' ')
		{
			count = 0;
		}
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j) == ' ' && s.charAt(j + 1) != ' ')
				{
					count++;
				}
			}
		return count;   
	}
}
