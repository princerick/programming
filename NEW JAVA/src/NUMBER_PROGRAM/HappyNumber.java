package NUMBER_PROGRAM;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt(); 
		while(true) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				sum+=rem*rem;
				n/=10;
			}
			n=sum;
			if(n==1 ) {
				System.out.println("It's a happy number");
				break ;
			}
			else if(n == 4){
				System.out.println("It's a sad number");
				break ;
			}
		}
		
	}
}
