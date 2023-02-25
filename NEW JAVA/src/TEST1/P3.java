package TEST1;

public class P3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int a=1;
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
