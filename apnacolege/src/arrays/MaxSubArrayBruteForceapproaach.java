package arrays;

import java.util.Scanner;

public class MaxSubArrayBruteForceapproaach {

	public static void sa(int list[]) {
		int i,j,k;
		int count=0;
		
		
		for(i=0;i<list.length;i++)
		{
			int maxsum=Integer.MIN_VALUE;
			int minsum=Integer.MAX_VALUE;
			for(j=i;j<=list.length;j++)
			{
				int sum=0;
				for(k=i;k<j;k++)
				{
					System.out.print(list[k]+" ");
					sum=sum+list[k];
					
				}
				if (sum>maxsum)
				{
					maxsum=sum;
				}
				if (sum<minsum)
				{
					minsum=sum;
				}
				System.out.print("      sum is :"+sum);
				count++;
				System.out.println();
				
				
			}
			System.out.println("max sum: "+maxsum);
			System.out.println("min sum: "+minsum);
			System.out.println();
			
		}

		System.out.println("the no of sub arrays: "+count);// printing no of sub arrays using count variable
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []list= {2,-3,4,-5,6};
//		int []list=new int[5];
//		System.out.println("enters numbers in array: ");
//		for(int i=0;i<list.length;i++)
//		{
//			list[i]=sc.nextInt();
//		}
		sa(list);
	}

}
