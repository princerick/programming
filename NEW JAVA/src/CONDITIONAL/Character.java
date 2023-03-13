package CONDITIONAL;

import java.util.Scanner;

public class Character {
	public static void main(String[] args) {
		
		
//				check entered character is a-z or A-Z...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("Entered character is lowercase a to z");
		}
		else {
			System.out.println("Entered character is uppercase A to Z");
		}
	}
}
