package accenture_coding;
import java.util.Arrays;
import java.util.Scanner;
public class ClasstoppersBalance {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int count=0;
		int []arr=new int[n];
		for(int i=0;i<n ;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(arr[n-1]==arr[i] )
			{
				count++;
			}
			
			if( arr[n-2]==arr[i])
				count++;
		}
		if(count>1)
		System.out.println(count-2);

	}

}
