package CONDITIONAL;

import java.util.Scanner;

public class Restorent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Don't have an account?>>>>>>>> REGISTER \nAlready have an account?>>>>>>>> LOGIN");
				System.out.println("......Register Here......");
				System.out.println();
				System.out.println("Enter username....");
				String username=sc.nextLine();
				System.out.println("Enter email id....");
				String email=sc.nextLine();
				System.out.println("Enter Phone number....");
				int num=sc.nextInt();
				System.out.println("Enter the password.....");
				String pass=sc.nextLine();
				System.out.println();
				System.out.println("Registered successfully...");
				System.out.println();
				
				System.out.println("Login for ordering food");
				System.out.println();
				System.out.println("Username.....");
				String username1=sc.nextLine();
				System.out.println("Password.....");
				String pass1=sc.nextLine();
				if((username.equals(username1)) && (pass.equals(pass1))) {
					System.out.println();
					System.out.println("Login Successful.....");
					System.out.println("...Welcome to Zomato...");
					System.out.println("***Available Resturants for you***");
					System.out.println("1. Grill Biriyani   2. Udupi   3. Biriyani Blue");
					int ch=sc.nextInt();
					switch(ch){
					case 1:
						System.out.println("@@@ WELCOME TO Grill Biriyani @@@");
						System.out.println("Todays Menue.....");
						System.out.println("A. Dum Biriyani   B. Mutton biriyani   C. Fried Rice");
						char price=sc.next().charAt(0);
						switch(price) {
						case 'A':
							System.out.println("....Dum Biriyani....");
							System.out.println("Slelct price>>>A. 200   B. 300");
							int amt=sc.nextInt();
							switch (amt) {
							case 'A':
								System.out.println("Total price is 200");
								break;
							case 'B':
								System.out.println("Total price is 300");
								break;
							}
							break;
//						case 'B':
//								System.out.println("....Mutton Biriyani....");
//								System.out.println("Slelct price>>>A. 300   B. 400");
//								int amt1=sc.nextInt();
//								switch (amt1) {
//								case 'A':
//									System.out.println("Total price is 200");
//									break;
//								case 'B':
//									System.out.println("Total price is 300");
//									break;
//								}
//								break;
//						case 'C':
//								System.out.println("....Fried Rice....");
//								System.out.println("Slelct price>>>A. 150   B. 200");
//								int amt2=sc.nextInt();
//								switch (amt2) {
//								case 'A':
//									System.out.println("Total price is 200");
//									break;
//								case 'B':
//									System.out.println("Total price is 300");
//									break;
//								}
//								break;
								default:
									System.out.println("Select the available menue");
									break;
						case 2:
							System.out.println("@@@ WELCOME TO UDUPI @@@");
							System.out.println("Todays Menue.....");
							System.out.println("A. Dhosa   B. Iddly   C. Polao");
							char price1=sc.next().charAt(0);
							switch(price1) {
						case 'A':
							System.out.println("....Dhosa....");
							System.out.println("Slelct price>>>A. 70   B. 120");
							if(price=='A') {
								System.out.println("Total price is 70");
							}
							else {
								System.out.println("Total price is 120");
							}
							break;
//						case 'B':
//								System.out.println("....Iddly....");
//								System.out.println("Slelct price>>>A. 60   B. 100");
//								if(price=='A') {
//									System.out.println("Total price is 60");
//								}
//								else {
//									System.out.println("Total price is 100");
//								}
//								break;
//						case 'C':
//								System.out.println("....Polao....");
//								System.out.println("Slelct price>>>A. 150   B. 200");
//								if(price=='A') {
//									System.out.println("Total price is 150");
//								}
//								else {
//									System.out.println("Total price is 200");
//								}
//								break;
//								default:
//									System.out.println("Select the available menue");
//											break;
							case 3:
									System.out.println("@@@ WELCOME TO Biriyani Blue @@@");
									System.out.println("Todays Menue.....");
									System.out.println("A. Dum Biriyani   B. Mutton biriyani   C. Fried Rice");
									char price2=sc.next().charAt(0);
									switch(price2) {
									case 'A':
										System.out.println("....Dum Biriyani....");
										System.out.println("Slelct price>>>A. 250   B. 350");
										if(price=='A') {
											System.out.println("Total price is 200");
										}
										else {
											System.out.println("Total price is 300");
										}
										break;
//									case 'B':
//											System.out.println("....Mutton Biriyani....");
//											System.out.println("Slelct price>>>A. 350   B. 450");
//											if(price=='A') {
//												System.out.println("Total price is 300");
//											}
//											else {
//												System.out.println("Total price is 400");
//											}
//											break;
//									case 'C':
//											System.out.println("....Fried Rice....");
//											System.out.println("Slelct price>>>A. 200   B. 250");
//											if(price=='A') {
//												System.out.println("Total price is 150");
//											}
//											else {
//												System.out.println("Total price is 200");
//											}
//											break;
//											default:
//												System.out.println("Select the available menue");
//												break;
						}
					}
				}
					default:
						System.out.println("Select the available Resturent...");
						break;
		}
	}
		else {
			System.out.println("Login Failed...");
			System.out.println("Check your username and password...");
			
		}
	}
}
				

