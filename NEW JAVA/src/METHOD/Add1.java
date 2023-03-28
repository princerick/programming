package METHOD;

public class Add1 {
	public static void main(String[] args) {
		System.out.println(add(20, 40));
		System.out.println(add(20.5, 60.5));
		System.out.println(add(50l, 60l));
		System.out.println(add('A', 'C'));
		//System.out.println(add("hello", "bye"));
	}
	static int add(double a, double b) {
		
		return (int) (a+b);
		
	}
}
