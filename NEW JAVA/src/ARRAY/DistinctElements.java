package ARRAY;

import java.util.Scanner;

public class DistinctElements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		boolean flag=true;
		
		for ( int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]!=a[j])
				{
					
					System.out.println(a[j]);
				}
			}
		}
	}
}
