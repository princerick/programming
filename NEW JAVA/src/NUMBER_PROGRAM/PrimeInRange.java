package NUMBER_PROGRAM;

import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int n1=sc.nextInt();
		System.out.println("Enter the ending range");
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++) {
			int n=i;
			boolean flag=true;
			for (int j = 2; j <=n/2; j++) {
				if(n%j==0) {
					flag=false;
				}
			}
			if(flag==true)
			{
				System.out.println(n+" is Prime");
			}
		}
	}
}
