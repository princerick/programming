package LEETCODE;

import java.util.Scanner;

public class ChangeString {

	/*	Read a string from the user and do the following
		case 1:i/p s1=hello -------- o/p s2 = h1e1l201
		case 2: i/p s1=america ----------- o/p s2 = a2m1e1r1i1c1*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char ch [] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 1;	
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i] == ch[j] && ch[j] != '?')
				{
					count++;
					ch[j] = '?';
				}
			}
			if(ch[i] != '?')
			{
				System.out.print(ch[i]+""+count+" ");
			}
		}
		
	}
}
