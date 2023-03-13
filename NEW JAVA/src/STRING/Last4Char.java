package STRING;

import java.util.Scanner;

public class Last4Char 
{

//					print last 4 char of a city
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city name");
		String s = sc.next();
		System.out.println(s.substring(s.length()-4));
	}
}
