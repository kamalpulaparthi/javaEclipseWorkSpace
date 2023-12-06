package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class Primeprogramme {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=59;
		int count=0;
		if(n==0||n==1)
			System.out.println("not prime");
		
		else if(n>1)
		{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				count++;
				
		}
		if(count==0)
		{
			System.out.println("prime");
			
		}
			else
			System.out.println("not prime");
		}
		
		
//		PRINT N PRIMES
		
		int m=20;
		int num=0;
		int i=2;
		
		
		while(num!=m)
		{
			int count1=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count1++;
				}
			}
			if(count1==0)
			{
				System.out.print(i+"  ");
//				if(num==3)						//PRINTING NTH PRIME
//					System.out.println(i);
				num++;
			}
//			else
//				System.out.print(i+"  ");	// printing non primes
			
			i++;
		}
		
		
		
	}

}
