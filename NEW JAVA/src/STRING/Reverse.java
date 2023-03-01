package STRING;

import java.util.Scanner;

//							reverse of a string

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String rev = "";
		for(int i = s.length()-1 ; i >= 0  ; i--)
		{
			 rev += s.charAt(i);
		}
		System.out.print(rev);
	}
}
