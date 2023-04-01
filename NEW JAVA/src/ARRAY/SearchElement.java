package ARRAY;

import java.util.Scanner;

public class SearchElement {
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
		boolean flag = true;
		int i = 0;
		for(i = 0 ; i < size ; i++) {
			if(a[i] == ele) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println(ele+" is not present...");
		}
		else {
			System.out.println(ele+" is present at index "+i);
		}
	}
}
