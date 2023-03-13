package CONDITIONAL;
import java.util.Scanner;
public class AlphabetNumberSpecial {
	public static void main(String[] args) {
		
		// Given character is alphabet, number or special character
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character ");
		char n=sc.next().charAt(0);
		if (n>='A' && n<='Z' || n>='a' && n<='z')
		{
			System.out.println(n+" is an alphabet");
		}
		else if(n>=0 && n<=9)
		{
			System.out.println(n+" is a number");
		}
		else
		{
			System.out.println(n+" is a specia character");
		}
	}
}
