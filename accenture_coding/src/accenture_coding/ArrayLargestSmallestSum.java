package accenture_coding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestSmallestSum {
	
	public static int sum(int arr[],int n)
	{
		Arrays.sort(arr);
		
		return arr[0]+arr[n-1];
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}

	System.out.println(sum(arr,n));
	}

}
