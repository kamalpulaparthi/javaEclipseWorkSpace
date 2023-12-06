package accenture_coding;
import java.util.*;
public class Arraydiffcount {
	
	public static int findCount(int arr[],int n,int num,int diff)
	{
		int  r;
		int count=0;
		for(int i=0;i<n;i++)
		{
			r=num-arr[i];
			if(r<0)
			{
				r=r*-1;
			}
			
			if(r>=0 && r<=diff)
			{
				count++;
			}
		}
		if(count>0)
		{
			return count;
		}
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		int diff=sc.nextInt();
		System.out.println(findCount(arr,n,num,diff));
	}

}
