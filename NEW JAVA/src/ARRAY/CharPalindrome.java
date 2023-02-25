package ARRAY;

import java.util.Scanner;

public class CharPalindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		char [] a = new char [size];
		System.out.println("Enter the array characters ");
		for(int i = 0 ; i < size ; i++) 
		{
			 a[i] = sc.next().charAt(0);
		}
		System.out.println("Array characters are... ");
			 System.out.println(a);
		char [] b = new char [a.length];
		for(int i = b.length-1 ; i >= 0 ; i--)
		{
			for(int j = 0 ; j < b.length ; j++)
			{
				b[j] = a[i];
				i--;
			}
		}
		boolean flag = false;
		for(int i = 0 ; i < size ; i++) 
		{
			if(a[i] == b[i])
			{
				flag = true;
			}
		}
		System.out.println("Reverse array characters are... ");
		 System.out.println(b);
		if(flag == true)
		{
			System.out.println("Character array is palindrome ");
		}
		else
		{
			System.out.println("Character array is not palindrome ");
		}
	}
}
