package kamalproject;

import java.util.*;


//		1. print primes till the range

//public class PrimePrint {
//
//	public static void main(String[] args) {
//		int i,n,j,count=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no of primes to be printed: ");
//		n=sc.nextInt();
//		
//		
//		
//		  for(i=2;i<=n;i++)
//		  {
//			count=0;
//			for(j=2;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					count++;
//					break;
//				}
//			}
//			if(count==0)
//			{
//				System.out.println(i);
//			}
//				
//		}
//		
//		
//	
//		}
//	
//
//}

//		2. print number of primes


public class PrimePrint {

	public static void main(String[] args) {
		int i,n,j,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of primes to be printed: ");
		n=sc.nextInt();
		i=2;
		int count2=0;
		while(n>1) 
		{
			
			flag=0;
		
		  
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
				count2++;
			}
			
			i++;
			if(count2==n)
			{
				break;
			}
				
		}
		
	
	
		}
	

}


