package testnew;
import java.util.*;
public class LoopsPracticeSet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
//		Question2:Write a program that reads a set of integers,and the n prints the sum of the even and odd integers.
		
//		int sum=0;
//		int sum1=0;
//	
//		for(int i=0;i<=n;i++) 
//		{
//			
//		if(i%2==0) 
//		{
//			sum+=i;
//			
//		}
//		
//		}
//		System.out.println("even numbers sum upto "+n+ " is   :"+ sum);
//		
//		for(int i=0;i<=n;i++) 
//		{
//			if(i%2==1)
//			{
//				
//				sum1+=i;
//				
//			}
//		}
//		System.out.println("odd numbers sum upto "+n+ " is   :"+  sum1);
//		
		
		// type 2
		
		
		
		
//		int sum=0;
//		int sum1=0;
//	
//		for(int i=0;i<=n;i++) 
//		{
//			
//		if(i%2==0) 
//		{
//			sum+=i;
//		}
//		
//		
//		else
//		{
//		
//			if(i%2==1)
//			{
//				
//				sum1+=i;
//				
//			}
//		}
//		
//		
//		
//	}
//		System.out.println("odd numbers sum upto "+n+ " is   :"+  sum1);
//		System.out.println("even numbers sum upto "+n+ " is   :"+ sum);
	
		
//		int temp=n;
//		int fact=1;
//		if(n==0)
//		{
//			System.out.println("factorial of "+temp+"is :"+fact);
//
//		}
//		else
//		{
//			while(n>0)
//			{
//				fact=fact*n;
//				n--;
//			}
//		}
//		System.out.println("factorial of "+ temp +"is :"+fact);
	

			// multiplication table
		
//		for(int i=1;i<=20;i++)
//		{
//			System.out.println(n+"*"+i+"="+n*i);
//		}
		
		
		MultiplicationTable(n);
		
		
		
		//
	}
	
	public static void MultiplicationTable(int num) 
	{
		 
		for(int i=1;i<=10;i++) 
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}



