package accenture_coding;
import java.util.*;
public class ArrayEvenOdd {
	public static int largeSmallSum(int arr[],int n)
	{
		int z,x;
		
		if(n%2==0)
		{
			z=n/2;
			x=n/2;
		}
		else
		{
			z=n/2;
			x=(n/2)-1;
		}
		
		int a1[]=new int [z];
		int a2[]=new int [x];
		
		System.out.println(a1.length);
		System.out.println(a2.length);
		
//		int j=0;
//		int d=0;
//		for(int i=0;i<n;)
//		{
//			
//			a1[j]=arr[i];
//			i+=2;
//			j++;
//		}
//		for(int i=1;i<n;)
//		{
//			
//			a2[d]=arr[i];
//			i+=2;
//			d++;
//		}
//		System.out.println( "test a1"+ a1[z-1]);
//		Arrays.sort(a1);
//		Arrays.sort(a2);
//		
		return 0;//a1[z-2]+a2[x-2];
		
		
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(largeSmallSum(arr,n));

	}

}
