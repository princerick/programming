package TEST1;

public class GCD {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int GCD=0;
		for(int i =1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				GCD=i;
			}
		}
		System.out.println("GCD of "+num1+" and "+num2+" is "+GCD);
	}
}
