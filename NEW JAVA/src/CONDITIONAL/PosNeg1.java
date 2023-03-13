package CONDITIONAL;
import java.util.Scanner;
public class PosNeg1 {
	public static void main(String[] args) {
		
		//Given number is positive or negative
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is positive or negative");
		int n=sc.nextInt();
		if(n>=0)
		{
			System.out.println(n+" is positive");
		}
		else 
		{
			System.out.println(n+" is negative");
		}
	}
}
