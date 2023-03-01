package ARRAY;

public class FetchDuplicate {
	public static void main(String[] args) {
		int a[]= {10,20,20,30,20};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[i]);

				}
			}
		}
	}
}
