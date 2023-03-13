package CONDITIONAL;

import java.util.Scanner;

public class ShopDiscount {
	public static void main(String[] args) {

		
//						shop discount on t-shirt...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the quantity of t-shirt");
		int qty=sc.nextInt();
		double total=qty*200;
		if(total>1000) {
			double disc=(total*10/100);
			double disc1=total-disc;
			System.out.println("You got a discount of Rs. "+disc);
			System.out.println("Your total bill: Rs. "+disc1);
		}
		else {
			System.out.println("Your total bill: Rs. "+total);
		}
	}
}
