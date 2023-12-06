package testnew;

import java.util.Scanner;

//public class LinearSearch {
//
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//
//		System.out.println("enter the number of elements in array :");
//		int n=sc.nextInt();
//		int[] list =new int[n];
//		int i;
//		int sum=0;
//		
//		System.out.println("enter elements of array :");
//		for(i=0;i<n;i++)
//		{
//			list[i]=sc.nextInt();
//		}
//		
//		System.out.println("enter the key number :");
//		int k=sc.nextInt();
//
//		for(i=0;i<n;i++)
//		{
//			if(list[i]==k) 
//			{
//				System.out.println("key element"+ k +"found  at position: "+"  "+i);
//			}
//		}
//
//		
//		
//	}
//
//}


//		2. type 2 linear search

public class LinearSearch {
	
	
	
	public static int linear(int list[],int k)
	{
		for(int i=0;i<list.length;i++)
		{
			if(list[i]==k) 
			
				return i;
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		

		System.out.println("enter the number of elements in array :");
		int n=sc.nextInt();
		int list[] =new int[n];
		int i;
		int sum=0;
		
		System.out.println("enter elements of array :");
		for(i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		
		System.out.println("enter the key number :");
		int k=sc.nextInt();

		int pos =linear(list,k);

		if(pos==-1)
		{
			System.out.println(" key number not found :");
		}
		else
		{
			System.out.println(" key number  found :"+"at  :"+pos);
		}
		
	}

}
