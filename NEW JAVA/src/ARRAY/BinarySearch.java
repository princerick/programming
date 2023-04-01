package ARRAY;

public class BinarySearch {
	
//								binary search	
	
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40,50,60};
		int ele = 50;
		int low = 0;
		int high = a.length - 1;
		boolean flag=false;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(a[mid] == ele)
			{
				flag=true;
				System.out.println(ele+" is found at index: "+mid);
				break;
			}
			else if(ele > a[mid])
			{
				low = mid + 1;
				high = high;
			}
			else
			{
				low = low;
				high = mid - 1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element is not present..");
		}
	}
}
