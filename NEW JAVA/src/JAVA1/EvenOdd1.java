package JAVA1;
import java.util.Scanner;
public class EvenOdd1 {
	public static void main(String[] args) {
		
		//Given number is positive or negative
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		if(n%2==0) 
		{
			System.out.println(n+" is even number");
		}
		else 
		{
			System.out.println(n+" is odd number");
		}
	}
}
