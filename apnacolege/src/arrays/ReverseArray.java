package arrays;

import java.util.Scanner;

//public class ReverseArray {
//	
//	public static void revarray(int list1[],int list[],int n)
//	{
//		int i;
//		list1[0]=list[n-1];
//		
//		for(i=1;i<n;i++)
//		{
//			list1[i]=list[n-i-1];
//		}
//		System.out.println(" the elements of reverse array are:");
//		for(i=0;i<n;i++)
//		{
//			System.out.println(list1[i]);
//		}
//	}
//
//
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//
//		System.out.println("enter the number of elements in array :");
//		int n=sc.nextInt();
//		int list[] =new int[n];
//		int list1[] =new int[n];
//		
//		int i;
//		System.out.println("enter elements of array in sorted ascending order :");
//		for(i=0;i<n;i++)
//		{
//			list[i]=sc.nextInt();
//		}
//		
//		revarray(list1, list, n);
//		
//	}
//
//}



//		2 type using temp


//public class ReverseArray {
//	
//
//
//
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//
//		System.out.println("enter the number of elements in array :");
//		int n=sc.nextInt();
//		int list[] =new int[n];
//		int temp;
//		
//		int i;
//		System.out.println("enter elements of array in sorted ascending order :");
//		for(i=0;i<n;i++)
//		{
//			list[i]=sc.nextInt();
//		}
//		
//		//list[0]=list[n-1];
//		for(i=0;i<=n/2;i++)
//		{
//			temp=list[i];
//			list[i]=list[n-i-1];
//			list[n-i-1]=temp;
//			
//			
//			
//			
//		}
//		
//		for(i=0;i<n;i++)
//		{
//			System.out.println(list[i]);
//		}
//		
//		
//	}
//
//}


//		3. type using temp and while loop

public class ReverseArray {
	



	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		

		System.out.println("enter the number of elements in array :");
		int n=sc.nextInt();
		int list[] =new int[n];
		int temp;
		int first=0;
		int last=n-1;
		
		int i;
		System.out.println("enter elements of array in sorted ascending order :");
		for(i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		
		//list[0]=list[n-1];
		while(first<last)
		{
			temp=list[first];
			list[first]=list[last];
			list[last]=temp;
			
			first++;
			last--;
			
			
			
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(list[i]);
		}
		
		
	}

}