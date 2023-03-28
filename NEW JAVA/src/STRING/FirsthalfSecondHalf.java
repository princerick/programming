package STRING;

import java.util.Scanner;

public class FirsthalfSecondHalf {

/*		print first half of the string in uppercase and last half 
								in lowercase*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.next().toLowerCase();
		System.out.println(s.substring(0,s.length()/2).toUpperCase()+s.substring(s.length()/2).toLowerCase());
	}
}
