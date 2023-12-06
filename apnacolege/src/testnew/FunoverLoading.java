package testnew;

import java.util.Scanner;

public class FunoverLoading {
	
	
//	public static int sum(int a,int b) {
//		return a+b;
//	}
//	public static int sum(int a,int b,int c) {
//		return a+b+c;
//	}
//	
//	public static void main(String[] args) {
//		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int a =sc.nextInt();
//		int b= sc.nextInt();
//		int c= sc.nextInt();
//
//		
//		int sum1=sum(a,b);
//		System.out.println(sum1);
//		int sum2=sum(a,b,c);
//		System.out.println(sum2);
//
//	}
	
	// 2   function over loading using different data types
	
	
//	
//	public static int sum(int a,int b) {
//		return a+b;
//	}
//	public static float sum(int a,int b,float c) {
//		return a+b+c;
//	}
//	
//	public static void main(String[] args) {
//		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int a =sc.nextInt();
//		int b= sc.nextInt();
//		float c= sc.nextFloat();
//
//		
//		int sum1=sum(a,b);
//		System.out.println(sum1);
//		float sum2=sum(a,b,c);
//		System.out.println(sum2);
	
	// 3 printing prime numbers in range
	
	
	
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int i,j;
		int flag=0;
		
		
		for(i=2;i<=n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			if( flag==0)
			{
				System.out.println(i);
			}
		
		
			}

	}
}
}
