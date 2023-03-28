package STRING;

public class ConvertionStringInteger {

//				convert string to integer and integer to string	
	
	public static void main(String[] args) 
	{
		int n = 65;
		String s = "65";
		System.out.println(n);
		System.out.println(s);
		String n1 = Integer.toString(n);
		int s1 = Integer.parseInt(s);
		System.out.println(n1);
		System.out.println(s1);
	}
}
