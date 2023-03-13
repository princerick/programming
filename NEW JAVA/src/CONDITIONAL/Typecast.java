package CONDITIONAL;
public class Typecast {
	public static void main(String[] args) {
		
		//byte to short
		
		byte a=10;
		short s=a;
		System.out.println(s);
		
		//int to double
		
		int b=200;
		double d=b;
		System.out.println(d);
		
		double c=20.3;
		int e= (int)c;
		System.out.println(e);
		
		long l=45;
		short k=(short)l;
		System.out.println(k);
		
		byte n=(byte)5.9;
		System.out.println(n);
		
		int a1=258;
		char c1=(char)a1;
		System.out.println(c1);
		
		char ch1='M';
		int a2=ch1;
		System.out.println(a2);
	}
}
