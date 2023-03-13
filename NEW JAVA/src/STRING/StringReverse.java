package STRING;

import java.util.Scanner;

public class StringReverse {

//								reverse a string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		String rev = "";
		for(int i = s.length()-1 ; i >= 0 ; i--)
		{
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
