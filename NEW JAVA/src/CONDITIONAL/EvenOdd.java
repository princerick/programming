package CONDITIONAL;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is even or odd");
		int n=sc.nextInt();
		String result= n%2==0 ? "Number is even" : "Number is odd";
		System.out.println(result);
	}
}
