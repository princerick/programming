package CONDITIONAL;
import java.util.Scanner;
public class VowelConsonantNumber {
	public static void main(String[] args) {
		
		// given character is vowel, consonant or number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+ " is a vowel");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+ " is a number");
		}
		else
		{
			System.out.println(ch+ " is a consonant");
		}
	}
}
