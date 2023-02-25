package METHOD;

import java.util.Scanner;

public class Students {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			//perc();
			grade();
		}
		
		
//									percentage
		
//		static void perc() {
//			System.out.println("Enter the marks obtained: ");
//			int m1 =sc.nextInt();
//			int m2 =sc.nextInt();
//			int m3 =sc.nextInt();
//			int m4 =sc.nextInt();
//			int m5 =sc.nextInt();
//			System.out.println("Enter the total marks: ");
//			int total =sc.nextInt();
//			int obtain = m1+m2+m3+m4+m5;
//			double avg = (m1+m2+m3+m4+m5)/5;
//			System.out.println("Average is "+avg);
//			double perc = obtain*100/total;
//			System.out.println("Percentage is "+perc);
//		}
		
		
//										grade
		
		static void grade() {
			System.out.println("Enter the marks obtained: ");
			int m1 =sc.nextInt();
			int m2 =sc.nextInt();
			int m3 =sc.nextInt();
			int m4 =sc.nextInt();
			int m5 =sc.nextInt();
			System.out.println("Enter the total marks: ");
			int total =sc.nextInt();
			int obtain = m1+m2+m3+m4+m5;
			double perc = obtain*100/total;
			System.out.println("Percentage is "+perc);
			if(perc>90) {
				System.out.println(perc+" => A Grade");
			}
			else if(perc>80 && perc<=90) {
				System.out.println(perc+" => B Grade");
			}
			else if(perc>=60 && perc<=80) {
				System.out.println(perc+" => C Grade");
			}
			else {
				System.out.println(perc+" => D Grade");
			}
		}
}
