package patterns;
import java.util.*;

public class NumberSequence {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		double res=1,res1=1;
		
		if(n==1 || n==2)
		{
			System.out.println(1);
		}
		for(int i=3;i<=n;i++)
		{
			
			if(i%2==0)
			{
				res=res*3;
				
				if(i==n)
				{
					System.out.println((int)res);
					break;
				}
			}
			else
			{
				if(i%2==1)
				{
					res1=res1*2;
					
					if(i==n)
					{
						System.out.println((int)res1);
						break;
					}
				}
			}
			
		}
		
		}

}
