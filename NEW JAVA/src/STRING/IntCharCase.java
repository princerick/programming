package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class IntCharCase {

//			 program to convert a sentence into init char case
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine().toLowerCase();
		String [] s1 = s.split(" ");
		String [] s2 = new String [s1.length];
		for (int i = 0; i < s1.length; i++) 
		{
			String str = s1[i];
			String str1 = "";
			for (int j = 0; j < str.length(); j++) 
			{
				if(j == 0)
				{
					str1 += str.toUpperCase().charAt(0);
				}
				else
					str1 += str.charAt(j);
//					str1 += str.toLowerCase().charAt(j);
			}
			s2[i] = str1;
		}
		System.out.println();
		System.out.println(Arrays.toString(s2));
	}
}
