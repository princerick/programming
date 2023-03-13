package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfSubString {

/*		split a given string into an array of substrings and count the 
 					number of elements in the array.*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String [] s1 = s.split(" ", 2);
		System.out.println(Arrays.toString(s1));
		System.out.println(s1.length+" elements are present in the array");
	}
 
}
