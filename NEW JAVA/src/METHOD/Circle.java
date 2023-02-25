package METHOD;

import java.util.Scanner;

public class Circle {
	static Scanner sc=new Scanner(System.in);
	
	
//											area
	
//	public static void main(String[] args) {
//		area();
//	}
//	static void area() {
//		final double pi=3.142;
//		System.out.println("Enter the value of radius of a circle: ");
//		int r =sc.nextInt();
//		double area=pi*r*r;
//		System.out.println("Area of circle is "+area);
//	}
	
	
//										circumference
	
	public static void main(String[] args) {
		circum();
	}
	static void circum() {
		final double pi=3.142;
		System.out.println("Enter the value of radius of a circle: ");
		int r =sc.nextInt();
		double circum=2*pi*r;
		System.out.println("Circumference of circle is "+circum);
	}
	
}
