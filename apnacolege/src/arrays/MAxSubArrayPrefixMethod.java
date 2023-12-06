package arrays;

import java.util.Scanner;

// this if prefix method for saving time comlexity

public class MAxSubArrayPrefixMethod {

	public static void kadanes(int list[]) {
		
		int cursum=0;
		//int  maxsum=Integer.MIN_VALUE;
		int  maxsum=0;
		for(int i=0;i<list.length;i++)
		{
			cursum=cursum+list[i];
			if(cursum<0)
			{
				cursum=0;
			}
			
			//maxsum=Math.max(cursum, maxsum);
			
	 }
		System.out.println("our max of sub array is:"+"  "+maxsum);
		
		
		}
		
		
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []list= {-2,-3,4,-1,-2,1,5,-3};
//		int []list=new int[5];
//		System.out.println("enters numbers in array: ");
//		for(int i=0;i<list.length;i++)
//		{
//			list[i]=sc.nextInt();
//		}
		kadanes(list);
	}

}

