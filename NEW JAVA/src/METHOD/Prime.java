package METHOD;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		System.out.println(isPrime(n));
	
	}
	
	public static boolean isPrime(int n) {
		
			boolean flag=true;
		
			for(int i=2;i<n;i++) {
				
				if(n%i==0) {
				
					flag=false;
				
				}
			
			}
			
			if(flag==true) {
			
				return(true);
			
			}
			
			else {
			
				return(false);
			
			}
		}
	}

