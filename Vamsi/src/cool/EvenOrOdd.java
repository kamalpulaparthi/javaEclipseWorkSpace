package cool;
import java.util.*;
public class EvenOrOdd {
//1 Write a program to check if a given number is even or odd.
//2	Write a program to find the sum of all even numbers from 1 to n.
//3	Write a program to find the sum of all odd numbers from 1 to n.
//4	Write a program to print all even numbers from 1 to n.
//5	Write a program to print all odd numbers from 1 to n.
//6	Write a program to find the product of all even numbers from 1 to n.
//7	Write a program to find the product of all odd numbers from 1 to n.
//8	Write a program to check if all the digits of a given number are even.
//9	Write a program to check if all the digits of a given number are odd.
//10	Write a program to find the largest even number in a given list.
//11	Write a program to find the smallest odd number in a given list.
//12 Write a program to count the number of even numbers in a given list.
//13 Write a program to count the number of odd numbers in a given list.
//14 Write a program to find the sum of all even digits in a given number.
//15 Write a program to find the sum of all odd digits in a given number.

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
//		int count;
//		if(n%2==0)
//		{
//			System.out.println("even");
//			count++;
//		}
//		System.out.println(count+"even numbers are there");
//		else
//		{
//			System.out.println("odd");
//		}
		
		//SECOND WAY OF ODD EVEN
		
//		if((n%2)-1==0)
//		{
//			System.out.println("odd");	
//		}
//		else
//		{
//			System.out.println("even");
//		}
		
		//ALL EVEN NUMBERS FROM 1-N
		
		
		int i,eve,sum=0;
		for(i=0;i<n;i++)
		{
			eve=2*i;
			System.out.println(eve);
			sum=sum+(2*i);
		}
		System.out.println("the sum of even numbers :"+sum);
		
		//ALL ODD NUMBERS FROM 1-N
//		
//		int i,odd;
//		for(i=0;i<n;i++)
//		{
//			odd=2*i+1;
//			System.out.println(odd);
//		sum=sum+(2*i+1);
//		}
//		System.out.println("the sum of odd numbers :"+sum);
		
		//ALL EVEN NUMBERS PRODUCT FROM 1-N
//		int i,even=1;
//		for(i=1;i<=n;i++)
//		{
//			even=(2*i)*even;
//			
//		}
//		System.out.println(even);
		
		//ALL ODD NUMBERS PRODUCT FROM 1-N
		
//		int i,odd=1;
//		for(i=1;i<=n;i++)
//		{
//			odd=(2*i+1)*odd;
//			
//		}
//		System.out.println(odd);
		
		//8,9 check if all the digits of a given number are even and odd
		
//		int i,r,temp;
//		
//		temp=n;
//		while(n!=0)
//		{
//			r=n%10;
//			if(r%2==0)
//			{
//				System.out.println(r+"even");
//			}
//			
//			
//			n=n/10;
//			
//		}
//		
//		while(temp!=0)
//		{
//			r=temp%10;
//			
//			if(r%2!=0) 
//			{
//				System.out.println(r+"odd");
//			}
//			
//			temp=temp/10;
//		}	
		
		//CHECKING EVEN ODD IN ARRAY  FROM 1-N
		
//		int[]a=new int[50];
//		int i;
//		for(i=0;i<n;i++)
//		{
//		a[i] =sc.nextInt();	
//		}
//		
//		  for(i=0;i<n;i++)
//		  {
//			if(a[i]%2==0)
//				
//				{
//					System.out.println(a[i]+",");
//				}
//					
//		  }
//		  			System.out.println("are even");
//		  
//		for(i=0;i<n;i++)
//		  {
//						
//			if(a[i]%2!=0)
//				{
//					System.out.println(a[i]+",");
//				}
//					
//			
////		  }
//					System.out.println("are odd");
//					
		
//			// 8,9,12,13 CHECKING EVEN ODD DIGITS IN A NUMBER
//					
//					String ch=sc.nextLine(); 
//					int i;
//					for(i=0;i<n;i++)
//					{
//						if(ch.charAt(i)%2==0);
//						{
//							System.out.println(ch.charAt(i)+",");
//						}
//						if(ch.charAt(i)%2!=0);
//						{
//							System.out.println(ch.charAt(i)+",");
//						}
//						
//					}
		
		// 8,9,12,13 CHECKING EVEN ODD DIGITS IN A NUMBER
					
//					String evenDigits="";
//					String oddDigits="";
//					int count1=0,count2=0;
//					while(n>0)
//					{
//						int digit=n%10;
//						if(digit%2==0)
//						{
//							evenDigits=digit+evenDigits;
//							count1++;
//						}
//						else
//						{
//							oddDigits=digit+oddDigits;
//							count2++;
//						}
//						n=n/10;
//						
//					}
//					
//					System.out.println(evenDigits+"are even"+" and no of even digits are"+count1);
//					System.out.println(oddDigits+"are odd"+" and no of even digits are"+count2);
//		
					
		//10	Write a program to find the largest even number in a given list.
		//11	Write a program to find the smallest odd number in a given list.
					
//					String ch=sc.nextLine();
//					int l=ch.length();
//					int max = ch.charAt(0);
//					int min = ch.charAt(0);
//					for(int i=0;i<l;i++)
//					{
//						if(max< ch.charAt(i))
//						{
//							max=ch.charAt(i);
//							
//						}
//					}
//					char c=(char)max;
//					System.out.println("max element is:  "+ (char)max);
//					
//					for(int i=0;i<l;i++)
//					{
//						if(min> ch.charAt(i))
//						{
//							min=ch.charAt(i);
//							
//						}
//					}
//					char s=(char)min;
//					System.out.println("min element is:  "+ (char)min);
//		
//					
		}

		
	}


