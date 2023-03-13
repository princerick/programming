package STRING;

import java.util.Scanner;

public class ConvertLowercase {

//					convert into lowercase without built-in method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) 
		{
		    ch = (char) (s.charAt(i) + 32);
		    System.out.print(ch);
		}
		
	}
}
