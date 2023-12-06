package cool;
import java.util.*;
public class MatriDiagonalPrint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		int arr[][]= {{1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}};
		int n=arr.length;		
		
		ArrayList<Integer> stat=new ArrayList<Integer>();
		
		int k=0;
//		
//		for(int i=0;i<n;i++)
//		{
//			k=i;
//			for(int j=0;j<=i;j++)
//			{
//				
//				
//				stat.add(arr[k][j]);
//				k--;
//			}
//		}
		int s=1;
		int o=0;
		while(s<=(n-1))
		{
			
		
		
			
			for(int j=n-1;j>=s;j--)
			{
				o=j;
				int i=(n-1)-j+1;
				stat.add(arr[o][j]);
				
			}
			s++;
			o--;
		}
		
		System.out.println(stat);
		
		
	}

}
