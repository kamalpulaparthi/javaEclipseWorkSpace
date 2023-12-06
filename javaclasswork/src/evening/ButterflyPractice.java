package evening;

public class ButterflyPractice {

	public static void main(String[] args) {
		
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}

		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<=2*(n-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<=2*(n-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
		
		
}
}