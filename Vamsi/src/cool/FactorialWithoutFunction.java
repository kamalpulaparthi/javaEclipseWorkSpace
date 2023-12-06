package cool;
import java.util.*;
public class FactorialWithoutFunction {

	public static int fact(int n)
	{
	
		
			
		
		if(n==0)
		{
			return 1;
		}
		else
		return n*fact(n-1);
	
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int res=1;
//		while (n>0)
//		{
//			res=res*n;
//			n--;
//		}
//System.out.println(res);
System.out.println(fact(n));
	}

}
