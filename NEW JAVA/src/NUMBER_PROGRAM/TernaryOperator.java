package NUMBER_PROGRAM;

public class TernaryOperator {
	
//								3 values...
	

//	public static void main(String[] args) {
//		int a=50;
//		int b=40;
//		int c=30;
//		int ans=(a>b)?(a>c?a:c):(b>c?b:c);
//		System.out.println(ans);
//	}
	
//								4 values...	
	
//	public static void main(String[] args) {
//		int a=50;
//		int b=60;
//		int c=70;
//		int d=80;
//		int ans= a>b && a>c && a>d?a:b>c && b>d?b:c>d?c:d;
//		System.out.println(ans);
//	}
	
//								5 values...
	
	public static void main(String[] args) {
		int a=60;
		int b=70;
		int c=80;
		int d=90;
		int e=50;
		int ans= a>b && a>c && a>d && a>e ? a : b>c && b>d && b>e ? b : c>d && c>e ? c : d>e ? d : e;
		System.out.println(ans);
	}
}
