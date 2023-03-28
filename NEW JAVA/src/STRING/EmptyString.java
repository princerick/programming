package STRING;

import java.util.Scanner;

public class EmptyString {

//					check which string is empty	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = "rick";
		String s2 = " ";
		String s3 = "";
		String s4 = null;
		if(s3.length() == 0)
		{
			System.out.println("It's a empty string");
		}
		else
		{
			System.out.println("It's not a empty string");
		}
	}
}
