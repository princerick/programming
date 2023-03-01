package ARRAY;

public class Ascii {

//					store ascii values of all char in ana array
	
	public static void main(String[] args) {
		String s = "rick";
		int [] a = new int [s.length()];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = (int) s.charAt(i);
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
