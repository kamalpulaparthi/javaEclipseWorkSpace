package testnew;

import java.util.Scanner;

public class PrimeNumbers {
	
	
	//		1.  PRIMES UNDER THE NUMBER N

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the n value: ");
//		int n=sc.nextInt();
//
//		for(int i=2;i<=n;i++)
//		{
//			int count=0;			
//			for(int j=1;j<=i;j++)		
//			{
//				if(i%j==0)
//				{
//					count++;
//					
//				}
//				
//			}
//			
//			if(count==2)
//			{
//				System.out.println(i);
//			}
//			
//		}
//
//}
	
	
	//		2. PRINT N PRIMES 
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the n value: ");
//		int n=sc.nextInt();
//		int m=0;
//		
//		for(int i=2;i<=1000;i++)
//			{
//				int count=0;			
//				for(int j=1;j<=i;j++)		
//				{
//					if(i%j==0)
//					{
//						count++;
//						
//					}
//					
//				}
//				
//				if(count==2)
//				{
//					System.out.println(i);
//					m++;
//				}
//				if(m==n)
//				{
//					break;
//				}
//				
//			}
//
//}
	
	
	
	//		3.PRINT NTH PRIME NUMBER
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n=sc.nextInt();
		int m=0;
		
		for(int i=2;i<=Integer.MAX_VALUE;i++)
			{
				int count=0;			
				for(int j=1;j<=i;j++)		
				{
					if(i%j==0)
					{
						count++;
						
					}
					
				}
				
				if(count==2 )
				{
					m++;
					if(m==n)
					{
					System.out.println(i);
					}
					
				}
				
				
			}

}
}
