package NUMBER_PROGRAM;

public class MulTable11to20 {
	public static void main(String[] args) {
		for (int i = 11; i <=20; i++) {
			int n=i;
			for (int j = 1; j <=10; j++) {
				int mul=n*j;
				System.out.println(n+"*"+j+"="+mul);
			}	
			System.out.println("**************************************");
		}
	}
}
