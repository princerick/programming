package TEST1;

public class ProductOfFactors {
	public static void main(String[] args) {
		int n=10;
		int prod=1;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				prod=prod*i;
			}
		}
		System.out.println("Product of factor of "+n+" is "+prod);
	}
}
