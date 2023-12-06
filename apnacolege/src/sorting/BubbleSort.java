package sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
//		for(int i:arr)
//		{
//			arr[i]=sc.nextInt();
//		}
		int l=arr.length;
		for(int i=0;i<l-1;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
