package METHOD;

import java.util.Scanner;

public class Polygon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice between rect, square, circle, triangle");
		String s=sc.nextLine();
		switch(s) {
		case "rect":
			rect(5,6);
			break;
		case "square":
			square(5);
			break;
		case "circle":
			circle(5);
			break;
		case "triangle":
			triangle(5,8);
			break;
		}
	}
	static void rect(int l,int b) {
		int area=l*b;
		System.out.println("Area of rectangle is "+area);
	}
	static void square(int s) {
		int area=s*s;
		System.out.println("Area of square is "+area);
	}
	static void circle(double r) {
		final double pi=3.142;
		double area=pi*r*r;
		System.out.println("Area of circle is "+area);
	}
	static void triangle(int h,int b) {
		double area=h*b*1/2;
		System.out.println("Area of triangle is "+area);
	}
}
