package STRING;

import java.util.Scanner;

public class StartsWithH {

//					print true if the String starts with H
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a string");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		if(s.startsWith(s1)==true)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
