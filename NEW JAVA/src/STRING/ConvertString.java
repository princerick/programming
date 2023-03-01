package STRING;

public class ConvertString {

//					convert char array into string
	
	public static void main(String[] args) {
		char [] ch = {'R','I','C','K'};
		String s = "";
		for(int i = 0 ; i < ch.length ; i++)
		{
			s+=ch[i];
		}
		System.out.println(s);
	}
}
