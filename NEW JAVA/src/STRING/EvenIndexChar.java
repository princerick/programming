package STRING;

import java.util.Iterator;
import java.util.Scanner;

public class EvenIndexChar 
{

//			print char present in even index separated by comma	
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string");
			String s = sc.next().toLowerCase();
			for (int i = 0; i < s.length(); i++) 
			{
				if(i % 2 == 0)
				{
					System.out.print(s.charAt(i)+",");
				}
			}
	}
}
