package testnew;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//type 2
		if(n==2) {
			System.out.println("prime number");
		}
		else
		{
		boolean flag=false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=true;
			}
		}
		
		if(flag==true)
		{
			System.out.println("not prime number");
		}
		else
		{
			System.out.println("prime number");
		}
		
		}
		
		// type 1
		
		
//		if(n==2) {
//			System.out.println("prime number");
//		}
//		else
//		{
//		int flag=0;
//		for(int i=2;i<n;i++)   //  n/2 can  also be used
//		{
//			if(n%i==0)
//			{
//				flag=1;
//			}
//		}
//		
//		if(flag==1)
//		{
//			System.out.println("not prime number");
//		}
//		else
//		{
//			System.out.println("prime number");
//		}
//		
//		}

		
//		do 
//		{
//			System.out.println("enter number");	
//			int n=sc.nextInt();
//			if(n%10==0)
//			{
//				continue;
//			}
//			System.out.println("number was: "+ n);	
//		}while(true);
	}

}
