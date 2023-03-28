package STRING;

import java.util.Scanner;

public class RemoveWhiteSpaces {

//				      remove white spaces from a string 
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
//		System.out.println(s.replaceAll("\\t","")); // for removing tab
//		System.out.println(s.replaceAll(" ","")); // for removing space
		System.out.println(s.replaceAll("\\s","")); // for removing tab and space both
	}
}
