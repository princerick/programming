package ARRAY;

import java.util.Scanner;

//			check the elements are repeated for how many times

public class CheckReapetElements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the 1st array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("The array elements are...");
		for(int i = 0 ; i < size ; i++) {
			 System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the search element");
		int [] visit = new int [a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = true;
			boolean flag1 = true;
			for(int n = 0 ; n < visit.length ; n++)
			{
				if(a[i] == visit[n])
				{
					flag1 = false;
					break;
				}
			}
			if(flag1 != false);
			{
				for(int j = i+1 ; j < size ; j++)
				{
					if(a[i] == a[j])
					{
						flag = false;
						visit[k] = a[i];
						k++;
						break;
					}
				}
			}
			if(flag == false)
			{
				System.out.println(a[i]+" is repeated");
			}
		}
	}
}
