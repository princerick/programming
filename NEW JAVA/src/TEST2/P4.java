package TEST2;

public class P4 {
	public static void main(String[] args) {
		int r=4;int c=7;
		for(int i=r;i>=1;i--) {
		for(int j=1;j<=c-i;j++) {
			//if(j<i) {
			System.out.print("  ");
		}
	
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	
	}
}
