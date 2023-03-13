package CONDITIONAL;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		//Which type of triangle
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lengths of the 3 sides of a triangle");
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
		if(l1==l2 && l2==l3)
		{
			System.out.println("Equilateral");
		}
		else if(l1==l2 || l2==l3 || l1==l3)
		{
			System.out.println("Isoceles");
		}
		else
		{
			System.out.println("Scalene");
		}
	}
}
