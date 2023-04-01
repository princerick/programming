package ARRAY;

public class DuplicateEleUsingVisited {

//				print the duplicates in an array using visited
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,41,2,2,2,3,1,3,1,7};
		int visit[]=new int[a.length];
		int n=0;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) 
		{
			for (int k = 0; k < visit.length; k++)
			{
				if(visit[k]==a[i])
				{
					flag=false;
					break;
				}
				else
				{
					flag=true;
				}
			}
			if(flag==true)
			{
				visit[n]=a[i];
				n++;
				int count=1;
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
					if(count>1)
					{
						System.out.print(a[i]+", ");
						break;
					}
				}
			}
		}
	}
}
