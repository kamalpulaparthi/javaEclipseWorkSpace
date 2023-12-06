package cool;
import java.util.*;



public class MatrixDiagonalSum {

	public static void main(String[] args) {

		
		int sum=0;

		int arr[][]= {{1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}};
		int n=arr.length;		
		int s=n-1;

						//FIRST APPROACH ( O(N^2))
		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				if(i==j)
//				{
//					sum+=arr[i][j];
//				}
//				else if(i+j==n-1)
//				{
//					sum+=arr[i][j];
//				}
//			}
//		}
//		
		
		
		//  SECOND APPROACH( O(N^2))
		
		
//		while(s>=0)
//		{
//			sum+=arr[s][s];
//			
//			
//			s--;
//			
//		}
//		int t=n-1;
//			
//			
//			for(int j=0;j<n;j++)
//			{
//				sum+=arr[j][t];
//				t--;
//			}
		
					//  OPTIMISED THIRD APPROPACH( O(N))
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i][i];
			
			if(i!=(n-1)-i)
			{
				sum+=arr[i][(n-1)-i];
			}
		}
		
		
		System.out.println(sum);
		
	}

}
