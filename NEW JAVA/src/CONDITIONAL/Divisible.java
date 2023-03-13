package CONDITIONAL;
import java.util.Scanner;
public class Divisible {
	public static void main(String[] args) {
		
		//Given number is divisible by 6
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%6==0)
		{
			System.out.println(n+" is divisible by 6");
		}
		else
		{
			System.out.println(n+" is not divisible by 6");
		}
	}
}
