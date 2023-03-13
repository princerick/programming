package CONDITIONAL;

import java.util.Scanner;

public class UpperLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is in uppercase");
		}
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is in lowercase");
		}
	}
}
