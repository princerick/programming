package CONDITIONAL;

import java.util.Scanner;

public class PythagorousTriangle {
	public static void main(String[] args) {
		
		//			 Pythagorean Triples or not...
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lengths of the 3 sides of a triangle");
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
		if(l1*l1+l2*l2==l3*l3 || l1*l1+l3*l3==l2*l2 || l3*l3+l2*l2==l1*l1)
		{
			System.out.println("It is a Pythagorean Triples");
		}
		else
		{
			System.out.println("It is not a Pythagorean Triples");
		}
	}
}
