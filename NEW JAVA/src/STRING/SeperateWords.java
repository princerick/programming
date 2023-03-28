package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class SeperateWords {

	//				seperate both strings
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String [] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
	}
}
