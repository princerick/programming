package ARRAY2D;

import java.util.Scanner;

public class Subtract {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row of 1st matrix");
		int r = sc.nextInt();
		System.out.println("Enter the number of coloumn of 1st matrix");
		int c = sc.nextInt();
		int [][] arr = new int [r][c];
		System.out.println("Enter the elements in 1st matrix");
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				arr [i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				System.out.print(arr [i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Enter the number of row of 2nd matrix");
		int r2 = sc.nextInt();
		System.out.println("Enter the number of coloumn of 2nd matrix");
		int c2 = sc.nextInt();
		int [][] arr2 = new int [r2][c2];
		System.out.println("Enter the elements in 2nd matrix");
		for(int i = 0 ; i < arr2.length ; i++)
		{
			for(int j = 0 ; j < arr2[i].length ; j++)
			{
				arr2 [i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < r2 ; i++)
		{
			for(int j = 0 ; j < c2 ; j++)
			{
				System.out.print(arr2 [i][j]+" ");
			}
			System.out.println();
		}

		int [][] sub = new int [r][c];
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				 sub [i][j] =  arr[i][j] - arr2[i][j];
				System.out.println();
			}
		}
		System.out.println("Sub of two arrays are:");
		for(int i = 0 ; i < sub.length ; i++)
		{
			for(int j = 0 ; j < sub[i].length ; j++)
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
	}
}
