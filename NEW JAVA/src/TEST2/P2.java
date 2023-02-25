package TEST2;

public class P2 {
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(count%2+" ");
					count++;
				}
			}
			System.out.println();
		}
	}
}
