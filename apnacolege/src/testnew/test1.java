package testnew;

import java.util.*;
//public class test1 {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String original=sc.nextLine();
//		String rev="";
//		int length=original.length();
//		int i;
//		for(i=length-1;i>=0;i--)
//		{
//			//System.out.println(original.charAt(i));
//			rev=rev + original.charAt(i);
//		}
//		if(rev.toLowerCase().equals(original.toLowerCase()))
//		{
//		System.out.println("palindrome");
//		
//		}
//
//}
//}


//public class test1 {
//
//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<i;j++)		//for(int j=i;j>0;j--)
//			{
//				System.out.print(i);
//			}
//		
//			System.out.println();
//		}
//
//}
//}
					//output:
	//1
	//22
	//333
	//4444
	//55555
	



//public class test1 {
//
//	public static void main(String[] args) {
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<i;j++)		
//			{
//				System.out.print(i);
//			}
//		
//			System.out.println();
//		}
//
//}
//}

		// output

			//1
			//22
			//333
			//4444



//public class test1 {
//
//	public static void main(String[] args) {
//		for(int i=1;i<5;i++)
//		{
//			for(int j=i;j>0;j--)		
//			{
//				System.out.print(i);
//			}
//		
//			System.out.println();
//		}
//
//}
//}

		// output
		//
		//1
		//22
		//333
		//4444


public class test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n=sc.nextInt();

		for(int i=2;i<=n;i++)
		{
			int count=0;			
			for(int j=1;j<=i;j++)		
			{
				if(i%j==0)
				{
					count++;
					
				}
				
			}
			
			if(count==2)
			{
				System.out.println(i);
			}
			
		}

}
}
