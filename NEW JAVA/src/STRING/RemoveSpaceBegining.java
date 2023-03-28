package STRING;

import java.util.Scanner;

public class RemoveSpaceBegining {

//						remove space from beginning
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println(s.trim());
	}
}
