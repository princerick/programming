package CONDITIONAL;

import java.util.Scanner;

public class SquarePerimeter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of a square:");
		double side=sc.nextDouble();
		double perimeter=4*side;
		System.out.println("perimeter of a square is "+perimeter);
	}
}
