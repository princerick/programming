package ARRAY2D;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of row");
		int r = sc.nextInt();
		System.out.println("Enter the size of coloumn");
		int c = sc.nextInt();
		double [][] arr = new double [r][c];
		System.out.println("Enter the elements");
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				arr [i][j] = sc.nextDouble();
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
	}
}
