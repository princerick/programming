package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class SplitIntoArray {

//					split into an array and print that array
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String [] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
	}
}
