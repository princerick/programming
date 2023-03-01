package STRING;

import java.util.Scanner;

public class Part {

//						print part of a string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println(s.substring(2,6));
	}
}
