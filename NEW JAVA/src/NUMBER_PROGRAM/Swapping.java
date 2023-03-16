package NUMBER_PROGRAM;

public class Swapping {
	public static void main(String[] args) {
//		int a=10;int b=20;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
		
//						without using temporary variable...	
		
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
