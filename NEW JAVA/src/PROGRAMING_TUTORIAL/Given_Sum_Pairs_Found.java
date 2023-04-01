package PROGRAMING_TUTORIAL;

public class Given_Sum_Pairs_Found {

	
	 public static void main(String[] args) 
	 {		
			int a[]= {1,2,3,4,5,6,7};
			int sum=20;		
			int low=0;
			int high=a.length-1;
			boolean flag=false;
			while(low < high)
			{
				if(a[low] + a[high] != sum)
				{
					high--;
				}			
				else if((a[low]+a[high]) == sum)
				{
					flag=true;
					System.out.println("Pair ("+a[low]+" , "+a[high] + ")");
					low++;
					high--;
				}
			}
			if(flag==false)
			{
				System.out.println("No Pairs Found");
			}
		}
}
