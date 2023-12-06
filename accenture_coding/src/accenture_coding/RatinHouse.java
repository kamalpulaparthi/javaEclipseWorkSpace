package accenture_coding;
import java.util.*;
public class RatinHouse {
	public static int  finder(int R,int U, int arr[],int N)
	{
		if(arr==null)
			return -1;
		
		int res=R*U;
		int sum=0;
		int count=0;
		for(int i=0;i<N;i++)
		{
			count++;
			sum=sum+arr[i];
			if(sum>=res)
			{
				break;
			}
		}
		if(sum<N)
		{
			return 0;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int u=sc.nextInt();
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(finder(r,u,arr,n));

	}

}
