package arrays;

import java.util.Scanner;



//		1. iterative binary search

//
//public class BinarySearch {
//	
//	public static int binse(int list[],int k)
//	{
//		int start=0;
//		int end=list.length-1;
//		while(start<=end)
//		{
//			int mid=(start+end)/2;
//			//comparisons
//			
//			if(list[mid]==k)
//			{
//				return mid;
//				
//			}
//			if(list[mid]<k)
//			{
//				start=mid+1;
//			}
//			else
//			{
//				end=mid-1;
//			}
//		}
//		return -1;
//	}
//
//	public static void main(String[] args) {
//Scanner sc =new Scanner(System.in);
//		
//
//		System.out.println("enter the number of elements in array :");
//		int n=sc.nextInt();
//		int list[] =new int[n];
//		int i;
//		int start=0;
//		int end=list.length-1;
//		
//		System.out.println("enter elements of array in sorted ascending order :");
//		for(i=0;i<n;i++)
//		{
//			list[i]=sc.nextInt();
//		}
//		System.out.println("enter the key number :");
//		int k=sc.nextInt();
//		
//		int pos =binse(list,k);
//		
//		
//		System.out.println(" the key number found at position  :"+pos);
//
//	}
//
//}


//		2. recursive binary serach


public class BinarySearch {
	
	public static int binse(int list[],int l,int r,int k)
	{
		
		if(l<=r)
		{
			int mid=(l+r)/2;
			//comparisons
			
			if(list[mid]==k)
			{
				return mid;
				
			}
			if(list[mid]>k)
			{
				return binse(list,l,mid-1,k);
			}
			else
			{
				return binse(list,mid+1,r,k);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		

		System.out.println("enter the number of elements in array :");
		int n=sc.nextInt();
		int list[] =new int[n];
		int i;
		int start=0;
		int end=list.length-1;
		
		System.out.println("enter elements of array in sorted ascending order :");
		for(i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		System.out.println("enter the key number :");
		int k=sc.nextInt();
		
		int pos =binse(list,0,n-1,k);
		if(pos==-1)
		{
			System.out.println(" the key number not found");
		}
		else 
		{
		System.out.println(" the key number found at position  :"+pos);
		}
	}

}
