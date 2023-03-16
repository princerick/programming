package NUMBER_PROGRAM;

public class SumofPrime {
	public static void main(String[] args) {
		int sum=0;
		int j=2;
		for(int i=40;i<=50;i++) {
			int n=i;
			boolean flag=true;
			for( j=2;j<n;j++) {
				if(n%j==0) {
					flag=false;
				}
		}
			if(flag==true) {
				System.out.println(n);
				sum+=n;
		}
	}
		System.out.println("Sum of prime numbers in range of 40 to 50 is "+sum);
}
}
