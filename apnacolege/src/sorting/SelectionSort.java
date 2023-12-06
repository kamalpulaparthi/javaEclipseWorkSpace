package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int l=arr.length;
		int minpos;
		for(int i=0;i<l-1;i++)
		{
			 minpos=i;
			for(int j=i+1;j<l;j++)
			{
				if(arr[minpos]>arr[j])
				{
					minpos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
		}
			
				
		
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

	}

