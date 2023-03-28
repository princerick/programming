package GFG;

public class PeakElement 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3};
		int N = 3;
		System.out.println("Peak element is: "+peakElement(arr, N));
	}
	public static int peakElement(int[] arr, int N)
    {
        int ele = 0;
       if(arr[0] > arr[1])
       {
           ele = arr[0];
       }
       else
       {
           for(int i=1; i<N; i++)
        {
           if(i != arr.length - 1)
           {
               if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
               {
                   ele = arr[i];
               }
           }
           else
           {
               if(arr[i] > arr[i-1])
               {
                   ele = arr[i];
               }
           }
        }
       }
       return ele;
    }
}
