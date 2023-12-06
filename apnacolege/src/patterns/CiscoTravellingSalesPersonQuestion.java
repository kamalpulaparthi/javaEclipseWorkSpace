package patterns;
import java.util.*;
public class CiscoTravellingSalesPersonQuestion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();

		int s=sc.nextInt();
		int m=sc.nextInt();
		int c=n/s;
		 System.out.println(c);
		int l=0;
		 int []con=new int[c];
		 int []arr=new int[n];
		 
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		
		 for(int i=0;i<n;i+=s)
		 {
			 int k=i+s;
			 int min =Integer.MAX_VALUE;
			 for(int j=i;j<k;j++)
			 {
				 if(arr[j]<min)
				 {
					 min=arr[j];
				 }
			 }
			  con[l]=min;
			 	l++;	
		 }

		 
		 Arrays.sort(con);
//		 for(int i:con)
//		 {
//			 System.out.println(i);
//		 }
		 
//		 
		 
		 
	 
	}

}
