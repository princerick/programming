package NUMBER_PROGRAM;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		boolean flag=true;
		for(i=1;i<=n;i++) {
			if(i*i==n) {
				flag=false;
				break;
			}
		}
		if(flag==false) {
			System.out.println("The square root of "+n+" is "+i);
		}
			else {
			System.out.println(n+" is not a perfect square number");
			}
		}
		
	}

