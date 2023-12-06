package accenture_coding;
import java.util.*;
public class CityenergyConsumption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int t=sc.nextInt();
		
		int []e=new int[n];
		int []ju=new int[n-1];
		for(int k=0;k<n;k++)
		{
			e[k]=sc.nextInt();
		}
		for(int k=0;k<n-1;k++)
		{
			ju[k]=sc.nextInt();
		}
		
		
		int i=0;
		int j=0;
		int sum=0;
		int hours=0;
		for(int d:e)
		System.out.println(d);
		
		for(int a:ju)
		System.out.println(a);
		
		
		while(i<n && j<n-1)
		{
			sum+=e[i];
			System.out.println(sum);
			
			if(sum <ju[j])
			{		
			for(int k=0;sum>=ju[j];k++)
			{
				sum+=e[i];
				hours++;
				System.out.println(hours+" "+sum);
			}
			}
			if(sum >=ju[j]) 
			{
				sum-=ju[j];
				i++;
				sum+=e[i];
				j++;
				hours++;
				System.out.println(hours+" "+sum);
			}
			if(sum>=t)
			{
				break;
			}
			
			
			
		}
		System.out.println(hours);

	}

}
