package ARRAY2D;

import java.util.Scanner;

public class RowSum {
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
		
		for(int i = 0 ; i < r ; i++)
		{	int sum =0;
			
			for(int j = 0 ; j < c ; j++)
			{
				 sum+=  arr[i][j];
				
			}
			System.out.print(sum+" ");
			System.out.println();
		}
	}
}
