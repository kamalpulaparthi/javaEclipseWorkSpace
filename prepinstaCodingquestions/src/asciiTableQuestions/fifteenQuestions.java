package asciiTableQuestions;
import java.util.*;
public class fifteenQuestions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit:");
		int x=sc.nextInt();
		
//				//	1.EVEN OR ODD NUMBER
//		System.out.println("1 .EVEN OR ODD NUMBER:");
//		
//		if(x%2==0)
//			{System.out.println("even");}
//		else {System.out.println("odd");}
//		
//		// or terinary operator
//		
//		String result=x%2==0? "even" : "odd";
//		
		
		
		
		
		
		
		//		2. POSITIVE OR NEGATIVE NUMBERS
		
		System.out.println("2 .POSITIVE OR NEGATIVE NUMBERS:");
		
		if(x<0)
			{System.out.println("negative");}
		if(x>0) {System.out.println("positive");}
		
		
//		3. SUM OF N NATURAL NUMBERS
		
		System.out.println("2 .SUM OF N NATURAL NUMBERS");
		int res=x*(x+1)/2;
		System.out.println(res);

		
		
		
//		3. SUM OF Numbers in given range
		
		System.out.println(" SUM OF Numbers in given range");
		
		System.out.println("enter the  first digit in range:");
		long f=sc.nextLong();

		System.out.println("enter the  last digit in range:");
		int l=sc.nextInt();
		long sum=0;
				
		for(long i=f;i<=l;i++)	// (num2*(num2+1))/2 -(num1*(num1+1))/2 
		{
			sum=sum+i;
		}
		System.out.println("the sum of digits in range of :"+f +" and "+l+"is:  "+sum);

		
		
		

//		3. LEAP YEAR
		
		System.out.println(" leap year ");
		System.out.println(" enter the year: ");
		 
		long y=sc.nextLong();
		 
		if(y%400==0 || (y%4==0 && y%100!=0))
		{
			System.out.println(" leap year ");
			
			
		}
		else
		{
			System.out.println(" not leap year ");
			
			
		}

		
		
		
//		3. nth prime no
		
		System.out.println(" nthe prime");
		
		System.out.println(" enter the n th number: ");
		 int flag=0;
		 int count=0;
		long n=sc.nextLong();
		int max=Integer.MAX_VALUE;

		for(int i=2;i<=max;i++)
		{
			flag=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
				flag++;
				}
				
				
			}
			if(flag==2)
			{
				count++;
				if(count==n)
				{
					System.out.println( i);
					break;
				}
			}
			
			
		}
		
		
		//	4.	primes between ra
		
		
		System.out.println(" enter the first limit and last limit  for prime");
		
		long L=sc.nextLong();
		long H=sc.nextLong();
		
		for(long i=L+1;i<=H;i++)
		{
			int flag1=0;
			for(long j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					flag1++;
				}
			}
			if(flag1==2)
			{
				System.out.println(i);
			}
		}
	}

}
