package STRING;

import java.util.Scanner;

public class SeperatedByComma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		System.out.println(s.substring(0,1)+","+s.substring(s.length()-1));
	}
}
