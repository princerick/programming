package STRING;

import java.util.Scanner;

public class RotationalString {

//					 check if rotational string or not	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String originalString = sc.nextLine();
		System.out.println("Enter another string to check");
		String keyString = sc.nextLine();
		originalString = originalString.concat(originalString);
		if(originalString.contains(keyString))
		{
			System.out.println("It's a rotational string");
		}
		else
		{
			System.out.println("It's not a rotational string");
		}
	}
}
