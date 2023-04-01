package PROGRAMING_TUTORIAL;

public class Common_Ele_In_3_Sorted_Arr {

	
	public static void common(int arr1[],int arr2[],int arr3[]) 
	{
		int x=0,y=0,z=0;
		while(x < arr1.length && y < arr2.length && z < arr3.length)
		{
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z])
			{
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if(arr1[x] > arr2[y])
			{
				y++;
			}
			else if(arr2[y] > arr3[z])
			{
				z++;
			}
			else
			{
				x++;
			}
		}
	}
	public static void main(String[] args) 
	{	
		int arr1[]= {1,5,10,20,40,80};
		int arr2[]= {1,6,7,10,20,80,100};
		int arr3[]= {1,3,4,10,15,20,30,70,80,120};
		common(arr1,arr2,arr3);
	}
}
