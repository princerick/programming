package STRING;

import java.util.Scanner;

public class PositionofA {

//						print position of char 'a'	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == 'a')
			{
				System.out.println(i);
			}
		}
	}
}
