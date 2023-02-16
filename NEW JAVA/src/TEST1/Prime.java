package TEST1;

public class Prime {
	public static void main(String[] args) {
		int n=5;
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not Prime number");
		}
	}
}
