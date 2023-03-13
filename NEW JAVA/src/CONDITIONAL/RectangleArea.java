package CONDITIONAL;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a rectangle:");
		double l=sc.nextDouble();
		System.out.println("Enter the width of a rectangle:");
		double b=sc.nextDouble();
		double area=l*b;
		System.out.println("Area of a rectangle is "+area);
	}
}
