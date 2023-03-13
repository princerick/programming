package STRING;

import java.util.Scanner;

public class LengthTimesPrint {

//			print the string as many times as the length of the string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int l = s.length();
		for (int i = 0; i < l; i++) 
		{
			System.out.print(s+" ");
		}
	}
}
