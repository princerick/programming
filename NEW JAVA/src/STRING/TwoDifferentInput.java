package STRING;

import java.util.Scanner;

public class TwoDifferentInput {

//				check two different string are same or not
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s = sc.next().toLowerCase();
		System.out.println("Enter the second string");
		String s1 = sc.next().toLowerCase();
		if(s.equals(s1))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}
