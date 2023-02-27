package ARRAY;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
//		int count=0;
//		for(int i = 0 ; i < size ; i++)
//		{
//			count++;
//			size-=count;
//			int temp=0;
//			temp = a[i];
//			a[i] = a[size];
//			a[a.length-1] = temp;
//			
//		}
//		for(int i = 0 ; i < a.length ; i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		
//						reverse using another array
		
		int [] b = new int [a.length];
		for(int i = a.length-1 ; i >= 0 ; i--) 
		{
			for(int j = 0 ; j < b.length ; j++)
			{
				b[j] = a[i];
				i--;
			}
		}
		for(int j = 0 ; j < b.length ; j++)
		{
			System.out.print(b[j]+" ");
		}
	}
}
