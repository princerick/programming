package TEST1;

public class Perfect {
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not perfect nnumber");
		}
	}
}
