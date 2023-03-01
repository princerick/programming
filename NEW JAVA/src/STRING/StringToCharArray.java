package STRING;

public class StringToCharArray {

//						convert a string to char array
	
	public static void main(String[] args) {
		String s = "RICK";
		char [] ch = new char [s.length()];
		for(int i = 0 ; i < ch.length ; i++)
		{
			ch[i] = s.charAt(i);
		}
		for(int i = 0 ; i < ch.length ; i++)
		{
			System.out.println(ch[i]);
		}
	}
}
