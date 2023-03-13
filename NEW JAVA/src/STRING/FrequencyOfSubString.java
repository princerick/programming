package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfSubString {

/*			split a given string into an array of substrings and 
 				find the frequency of the substrings*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String [] s1 = s.split(" ");
		String [] v = new String[s1.length];
		
		for (int i = 0; i < s1.length; i++) 
		{
			String s2 = s1[i];
			int count = 1;
			boolean flag = isvisited(s2 , v);
			if(flag)
			{
			for (int j = i+1; j < s1.length; j++) 
			{
				if(s2.equals(s1[j]))
				{
					count++;
				}
			}
			System.out.println(s2+" is  present "+count+" times");
			v[i]=s2;
			}
		}
	}

	static boolean isvisited(String s2, String[] v) 
	{
		for (int i = 0; i < v.length; i++) 
		{
			if(s2.equals(v[i]))
			{
				return false;
			}
		}
		return true;
	}
}
