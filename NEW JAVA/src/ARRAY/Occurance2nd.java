package ARRAY;

import java.util.Scanner;

public class Occurance2nd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Enter the search element");
		int ele=sc.nextInt();
		int count=0;
		boolean flag = false;
		int i=0;
		for( i = 0 ; i < size ; i++) {
			if(a[i] == ele) {
				count++;
			}
			if(count==2) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println(ele+" is present for 2nd times in index "+i );
		}
			else {
				System.out.println(ele+" is not present for 2nd times" );
			}
	}
}
