package ARRAY;

import java.util.Scanner;

//			check how many elements are repeated how many times

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
		int ele=sc.nextInt();
		int count = 0;
			for(int j = 0 ; j < size ; j++)
			{
				if(ele == a[j])
				{
					count++;
				}
			}
		System.out.println("\n"+ele+" is present "+count+" times");
	}
}
