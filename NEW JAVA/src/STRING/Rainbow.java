package STRING;

//					print first char of each color of rainbow

public class Rainbow {
	public static void main(String[] args) {
		String [] str = {"red", "yellow", "orange", "violet", "green", "blue", "indigo"};
		for(int i = 0 ; i < str.length ; i++)
		{
			char ch = str[i].charAt(0);
			System.out.println(ch);
					
		}
	}
}
