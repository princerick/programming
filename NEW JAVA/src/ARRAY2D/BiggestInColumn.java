package ARRAY2D;

import java.util.Scanner;

public class BiggestInColumn {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row of the matrix");
		int r = sc.nextInt();
		System.out.println("Enter the number of coloumn of the matrix");
		int c = sc.nextInt();
		int [][] arr = new int [r][c];
		System.out.println("Enter the elements of the matrix");
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
		{	int max = arr[i][0];
			
			for( int j = 0 ; j < c ; j++)
			{
				if(arr[j][i] > max)
				{
					max = arr[j][i];
				}
				
			}
			System.out.print(max+" ");
			System.out.println();
		}
	}
}
