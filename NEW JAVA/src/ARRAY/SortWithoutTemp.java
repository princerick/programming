package ARRAY;

public class SortWithoutTemp {
public static void main(String[] args) {
	int a[]= {1,3,5,7,8,2};
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
		}
	}
}
	for(int i=0; i<a.length   ; i++)
	{
	System.out.println(a[i]);	
	}
	}

}
