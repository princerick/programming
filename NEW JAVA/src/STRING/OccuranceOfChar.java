package STRING;

import java.util.Scanner;

public class OccuranceOfChar {

/*					 find the occurance of particular character
					  input-aaaaabaccaaa,target char=a,output=9*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the required char");
		char c = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == c)
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("The frequency of "+c+" is "+count);
	}
}
