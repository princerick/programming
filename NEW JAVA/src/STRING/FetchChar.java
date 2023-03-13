package STRING;

import java.util.Scanner;

public class FetchChar 
{

//				print first and last char of a given string
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.print(s.charAt(0)+" "+s.charAt(s.length()-1));
		System.out.println("=======================");
		System.out.print(s.substring(0,1)+" "+s.substring(s.length()-1));
		
	}
}
