package ARRAY2D;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOf2$3 {

//						addition of 2 * 3 matrix
	
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row size ");
		int r=sc.nextInt();
		System.out.println("Enter the Column Size1");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the elements of row "+(i+1));
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i <= a.length; i++) 
		{
			int sum=0;
			for (int j = 0; j < a.length; j++) 
			{
				sum+=a[j][i];
			}	
			System.out.print(sum+" ");
		}

	}
}
