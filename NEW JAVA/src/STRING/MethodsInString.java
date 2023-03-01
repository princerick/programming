package STRING;

//						in-built methods in string

public class MethodsInString {
	public static void main(String[] args) {
		String s = "Software Developer";
		System.out.println(s.length());
		System.out.println("==================");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("==================");
		System.out.println(s.startsWith("Soft"));
		System.out.println(s.startsWith("soft"));
		System.out.println(s.startsWith("Dev"));
		System.out.println("==================");
		System.out.println(s.endsWith("per"));
		System.out.println(s.endsWith("Per"));
		System.out.println(s.endsWith("dev"));
		System.out.println("==================");
		System.out.println(s.concat(" in jspiders"));
		System.out.println("==================");
		System.out.println(s.contains("ware"));
		System.out.println("==================");
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		System.out.println("==================");
		System.out.println(s.indexOf('f'));
		System.out.println(s.indexOf('D'));
		System.out.println("==================");
		String s1 = "java";
		String s2 = "java";
		String s3 = "Java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("==================");
		String x = "hello rick";
		System.out.println(x.substring(4));
		System.out.println(x.substring(4,8));
		System.out.println(x.substring(1,7));
	}
}
