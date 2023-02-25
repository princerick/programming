package RECURSIVE;

public class P1 {
	public static void main(String[] args) {
		hello(5);
	}
	static void hello(int count) {
		if(count<1) {
			return;
		}
		else {
			System.out.println("Welcome to Test Yantra...");
			hello(count-1);
		}
	}
}
