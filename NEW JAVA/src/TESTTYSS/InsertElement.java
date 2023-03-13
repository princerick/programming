package TESTTYSS;

public class InsertElement {
	public static void main(String[] args) {
		int [] a = {9,5,7,3};
		int [] b = new int [a.length + 1];
		int index =  3;
		int ele = 100; 
		int j = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if ( i == index)
			{
				b[j] = ele;
				j++;
			}
			b[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}
}
