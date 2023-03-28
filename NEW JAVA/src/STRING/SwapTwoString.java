package STRING;

public class SwapTwoString {

//				        	swap two strings
	
	public static void main(String[] args) 
	{
		String s1 = "rick";
		String s2 = "tech";
		String temp = "";
		temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println(s1);
		System.out.println(s2);
	}
}
