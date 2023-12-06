package testnew;
import java.util.*;


//		type 1 avg of three numbers


//public class MethodsPracticeSet {
//	
//	public static float Avg(float a,float b,float c) {
//		float average;
//		average=(a+b+c)/3;
//		
//		
//		
//		return average;
//	}
//
//	public static void main(String[] args) {
//		
//		Scanner sc =new Scanner(System.in);
//		float a=sc.nextFloat();
//		float b=sc.nextFloat();
//		float c=sc.nextFloat();
//		
//		float res=Avg(a,b,c);
//		System.out.println(res);
//	}
//
//}


//		type 2  using array

//public class MethodsPracticeSet {
//	
//	public static int Avg(int[] list,int n) {
//		int average;
//		int i;
//		int sum=0;
//		for(i=0;i<n;i++)
//		{
//			sum=sum+list[i];
//		}
//		
//		
//		
//		
//		return sum/n;
//	}
//
//
//
public class MethodsPracticeSet {



	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of elemenrts:");
		int n=sc.nextInt();
		int[] list =new int[n];
		int i;
		int sum=0;
		for(i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
			sum+=list[i];
			
		}
		
		
		int res=sum/n;
		System.out.println(res);
	}

}


  //  		Question2:
//			WriteamethodnamedisEventhatacceptsanintargument.
//			The method should return true if the argument is even,or false otherwise.Also write a program 
//			to test your method.

//public class MethodsPracticeSet {
//	
//	public static boolean isEven(int n) {
//		
//	
//		if(n%2==0)
//		{
//		return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//
//	public static void main(String[] args) {
//		
//		Scanner sc =new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		if(isEven(n))		// or  if(isEven(n)==true)	
//		{
//			System.out.println("even");
//		}
//		else
//		{
//			System.out.println("not even");
//		}
//	}
//
//}

//			Question3:Write a Java program to check if a number is a palindrome in Java?


//
//public class MethodsPracticeSet {
//	
//
//	public static void main(String[] args) {
//		
//		Scanner sc =new Scanner(System.in);
//		long n=sc.nextLong();
//		long temp=n;
//		long r,res=0;
//		while(n>0)
//			
//		{
//		r=n%10;
//		res=res*10+r;
//		
//		n=n/10;
//		}
//		if(res==temp)		// or  if(isEven(n)==true)	
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//	}
//}

//		Question 5 :Write a Java method to compute the sum of the digits in an integer

//public class MethodsPracticeSet {
//	
//
//	public static void main(String[] args) {
//		
//		Scanner sc =new Scanner(System.in);
//		long n=sc.nextLong();
//		long temp=n;
//		long r,sum=0;
//		while(n>0)
//			
//		{
//		r=n%10;
//		sum=sum+r;
//		
//		n=n/10;
//		}
//		
//			System.out.println(sum);
//		
//	}
//}
//
