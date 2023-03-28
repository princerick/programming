package ARRAY;

import java.util.Scanner;

public class P {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Hom many numbers u want to be printed?");
	int end=sc.nextInt();
	int start="*".length();
	for(int i=start;i<=end;i++)
	{
		System.out.println(i);
	}
}
}
