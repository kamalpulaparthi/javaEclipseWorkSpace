package strings;

public class KingProspertyPeriod {

	public static void main(String[] args) {
		int arr[]= {5, 5, -1, -2, 3, -1, 2, -2};
		int d=3;
		int n=arr.length;
		int i,j,k;
		int s=0;
		int f=0;
		int s2=0,f2=0;
		int max1=Integer.MIN_VALUE;

		int max2=Integer.MIN_VALUE;
		
		
		
		// for finding first period[S1,F1]
		
		
		for(i=0;i<n-1-d;i++)
		{
			int start=i;
			
			for(j=i;j<n-1-d;j++)
			{
				int end =j;
				int sum=0;
				for(k=start;k<=end;k++)
				{
					sum=sum+arr[k];
					
				}
				System.out.println("sum: "+sum);
				
				
				if(sum>max1)
				{
					max1=sum;
					 
					s=i;
					 
					f=j;
				}
			}
		}
System.out.println(max1+"  "+"by"+s+1+"  "+f+1);
		
		for(i=f+3+1;i<=n-1;i++)
		{
			int start=i;
			
			for(j=i;j<=n-1;j++)
			{
				int end=j;
				int sum=0;
				for(k=start;k<=end;k++)
				{
					sum=sum+arr[k];
				}
				
				if(sum>max2)
				{
					max2=sum;
					 s2=i;
					 f2=j;
					
				}
			}
		}
		
		System.out.println(max2+"  "+"by"+s2+1+" "+f2+1);
		
		System.out.println(max1+max2);
		
	}

}
