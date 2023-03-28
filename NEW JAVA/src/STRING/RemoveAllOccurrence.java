package STRING;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveAllOccurrence {

//				remove all the occurrence of a given char 
	
//							using split method
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the char to be removed");
		String key = sc.nextLine();
		s = s.replace(key, " ");
		String [] x = s.split(" ");
		for (int i = 0; i < x.length; i++) 
		{
			System.out.print(x[i]);
		}
	}
	
//						without using split method
	
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string");
//		String s = sc.nextLine();
//		char [] ch = s.toCharArray();
//		String res = "";
//		System.out.println("Enter the char to be removed");
//		char key = sc.next().charAt(0);
//		for (int i = 0; i < ch.length; i++) 
//		{
//			if(ch[i] != key)
//			{
//				res += ch[i];
//			}
//		}
//		System.out.println(res);
//	}
}
