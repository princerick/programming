package PROGRAMING_TUTORIAL;

public class Reverse_By_Given_Size {

	
	public static void main(String[] args) 
	{
		int []a= {2,1,4,5,3,6,9};
		int k=4;
		reverse(a,k);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}
		public static void reverse(int[] a,int k)
		{
			int len=a.length;
			for(int i=0;i<len;i=i+k)
			{
				int start=i;
				int end=Math.min(i+k-1, len-1);
						
				while(start<=end)		
				{
					int temp=a[start];
				  a[start]=a[end];
				  a[end]=temp;
				  start++;
				  end--;
				}					
			}
		}
}
