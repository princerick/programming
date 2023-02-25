package LETTER;

import java.util.Scanner;

public class Letter1 {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pattern size");
		int n=sc.nextInt();
		System.out.println("Enter the row size");
		int r=sc.nextInt();
		System.out.println("Enter the column size");
		int c=sc.nextInt();
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch (ch) {
		
		
//										  1
		
		case 1:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1 || i==r || j==1 || j==c) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;
	
	
//											2
	
		case 2:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;
	
	
//											3
	
		case 3:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;
	
	
//											4
	
		case 4:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==j || i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;

	
	
//											5
	
		case 5:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==r || j==c || i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;

	
//											6
	
		case 6:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1 || i==r || i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;
	
	
//											7
	
		case 7:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1 || j==1 || i==j || i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		break;
		
		
		
//											 8
		
		case 8:
			char chr='A';
		for(int i=1;i<=r;i++) {
				for(int j=1;j<=c;j++) {
					if(i==j) {
						System.out.print(chr+++" ");
					}
					else {
						System.out.print(i+j+" ");
					}
				}
				System.out.println();
			}
			break;
			
			
//											9
			
		case 9:
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(j<=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
				for(int i=1;i<=r;i++) {
					for(int j=c-1;j>=1;j--) {
						if(j>=i) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				break;
				
				
//											10
				
		case 10:
			for(int i=5;i>=1;i--) {
				for(int j=1;j<=c;j++) {
					if(j>=i) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}	
			for(int i=1;i<=r;i++) {
				for(int j=1;j<=c;j++) {
					if(j>i) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			break;
			
			
//											11
			
		case 11:
			for(int i=1;i<=r;i++) {
				for(int j=1;j<=c-i;j++) {
					System.out.print("  ");
				}
					for(int k=1;k<=2*i-1;k++) {
						if(k==1 || k==2*i-1 || i==r) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			break;
			
			
//											12
			
		case 12:
			for(int i=r;i>=1;i--) {
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++) {
					if(i==r || k==1 ||k==2*i-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			break;
			
			
//											13
			
		case 13:
			for(int i=1;i<=r;i++) {
				int a=1;
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++) {
					System.out.print(k%2+" ");
					a++;
				}
				System.out.println();
			}
			break;
			
			
//											14
			
		case 14:
			int count=1;
			for(int i=1;i<=r;i++) {
				
				for(int j=1;j<=n-i;j++) {
					
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++) {
					
					System.out.print(count%2+" ");
					count++;
				}
				System.out.println();
			}
			break;
			
			
//											15
			
		case 15:
			for(int i=1;i<=r;i++) {
				
				for(int j=1;j<=n-i;j++) {
					
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++) {
					
					System.out.print(i%2+" ");

				}
				System.out.println();
			}
			break;
			
			
//											 16
			
		case 16:
			for(int i=1;i<=r;i++) {
				
				for(int j=1;j<=n-i;j++) {
					
					System.out.print("  ");
				}
				char ch2='a';
				for(int k=1;k<=2*i-1;k++) {
					
					System.out.print(ch2+++" ");
					
				}
				System.out.println();
			}
			break;
			
			
//											  17
			
		case 17:
			char ch1='a';
			for(int i=1;i<=r;i++) {
				
				for(int j=1;j<=n-i;j++) {
					
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++) {
					
					System.out.print(ch1+++" ");
				}
				System.out.println();
			}
			break;
			
			
//											18
			
		case 18:
			for(int i=1;i<=r;i++) {
				int count1=1;
				for(int j=1;j<=n-i;j++) {
					
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++) {
					
					if(k<i) {
					System.out.print(count1+++" ");
					}
					else {
						System.out.print(count1--+" ");
					}
				}
				System.out.println();
			}
			break;
		}
	}

}

