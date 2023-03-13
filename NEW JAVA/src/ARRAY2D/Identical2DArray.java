package ARRAY2D;

public class Identical2DArray {

//					both 2D arrays are identical or not	
	
	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3}};
		boolean rs=false;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				if(a[i][j]==b[i][j])
				{
					rs=true;
					break;
				}
				else
				{
					rs=false;
				}
			}
		
		}
		if(rs==true)
		{
			System.out.println("Identical");
		}
		else
		{
			System.out.println("not Identical");
		}
	}
}
