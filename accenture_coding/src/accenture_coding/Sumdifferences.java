package accenture_coding;
import java.util.*;
public class Sumdifferences {

	
	public static int differenceofSum(int n, int m)
	{
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<=m;i++)
		{
			if(i%n==0)
			{
				sum+=i;
				continue;
			}
			else
				sum1+=i;	
		}
		return Math.abs(sum1-sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		
		
		if(n>0&&m>0)
		System.out.println(differenceofSum(n, m));
		
		
	}

}
