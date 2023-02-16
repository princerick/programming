package TEST1;

public class Strong {
	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int copy=n;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(copy==sum) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not strong number");
		}
	}
}
