package testnew;
import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//int n,i;
//		for(int i=0;i<=n;i++)
//		{
//		System.out.println("**********");
		
		// 1 star pattern
		
//		String res ="";
//		for(int i=0;i<n;i++)
//		{
//		
//			res=res+"*";
//			System.out.println(res);
//			
//		}
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 2 inverted star pattern
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n-i+1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		// 2 inverted numeric  pattern
//				for(int i=1;i<=n;i++)
//				{
//					for(int j=1;j<=i;j++)
//					{
//						System.out.print(j);
//					}
//					System.out.println();
//				}

		// 2 inverted numeric  pattern
		
//		char ch='A';
//		int s=ch;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				s=s+1;
//				System.out.print((char)s);
//			}
//			System.out.println();
//		}
		
		// 2 print pyramyd alphabets
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
//		int r;
//		String reverse ="";
//		while(n>0)
//		{
//			r=n%10;
//			reverse=reverse+r;
//			n=n/10;
//		}
//		System.out.println(reverse);
//		}
		
		//
	}

}
