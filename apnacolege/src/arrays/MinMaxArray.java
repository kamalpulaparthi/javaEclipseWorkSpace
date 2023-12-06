package arrays;

import java.util.Scanner;

public class MinMaxArray {
	
	public static int Max(int list[])
	{
	int max=list[0];
	for(int i=0;i<list.length;i++)
	{
	if(list[i]>max)
	{
		max=list[i];
	}
	
	}
	return max;
	}
	public static int Min(int list[])
	{
		int min=list[0];
		for(int i=0;i<list.length;i++)
		{
		if(list[i]<min)
		{
			min=list[i];
		}
		
		}
		return min;
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

		int maxvalue =Max(list);
		int minvalue =Min(list);
		
			System.out.println(" the max value in the array is :"+maxvalue);
		
		
			System.out.println(" the min value in the array is :"+minvalue);
		
		
	

	}

}
