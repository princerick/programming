package ARRAY2D;

import java.util.Scanner;

public class IdentityMatrix {
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
		boolean flag = false;
		if(r != c)
		{
			System.out.println("Enetr a square matrix");
		}
		else
		{
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				if((i == j && arr[i][j] == 1) || (i != j && arr[i][j] == 0))
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
		}
		}
		if(flag == true)
		{
			System.out.println("Identity Matrix...");
		}
		else
		{
			System.out.println(" Not Identity Matrix...");
		}
	}
}
