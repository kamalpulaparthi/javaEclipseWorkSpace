package testnew;
import java.util.*;
public class FunctionsMethods {
	
	public static int fact(int num) {
		
//		if(num>=1)
//		{
//			return num*fact(num-1);
//		}
//		else
//		{
//			return 1;
//		}
		
	int t=1;
		if(num==0)
		{
			return 0;
		}
		else
		{
		for(int i=1;i<=num;i++)
		{
			t= i*t;
			
		}
		return t;
		}
	}
	
	public static int fact(int n,int r) {
//		int num=1;
		
		
//		for(i=1;i<=n;i++)
//		{
//			num=num*i;
//		}
	
		
		// 1 binomial coefficient
		
		int a=fact(n);
		int b=fact(r);
		int c=fact(n-r);
		
		return a/(b*c);
		
	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		
//		
//		int res =fact(n);
//		System.out.println(res);
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int r= sc.nextInt();
		
		
		int res=fact(n,r);
		System.out.println(res);

		//System.out.println(fact(n));
		//
	}

}
