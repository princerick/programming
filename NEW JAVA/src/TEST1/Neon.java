package TEST1;

public class Neon {
	public static void main(String[] args) {
		int n=9;
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==n) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("NOt neon number");
		}
	}
}
