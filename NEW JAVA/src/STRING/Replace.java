package STRING;

import java.util.Scanner;

public class Replace {

//				replace a char from user given string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a string");
		String s = sc.nextLine();
		System.out.println("Enter a char to be replaced");
		char ch1 = sc.next().charAt(0);
		System.out.println("Enter the new char");
		char ch2 = sc.next().charAt(0);
		System.out.println(s.replace(ch1, ch2));
	}
}
