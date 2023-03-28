package STRING;

public class occuranceofRepeatedChar {

//					print char with its occurance 
	
	public static void main(String[] args) {
		
		String s="hello";
		String visited = "";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);

			int count = 0;
			if(visited.indexOf(ch) == -1)
			{
				for (int j =0; j < s.length(); j++) 
				{	
					if(ch == s.charAt(j))
					{
						count++;
					}
				}
				visited+=ch+""+count+" ";
			}	
		}
			System.out.println(visited);
		}
}
