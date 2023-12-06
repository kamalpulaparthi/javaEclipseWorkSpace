package practiceWordTabularquestionsOnNoSysArrayString;

public class Gcd {
	
	public static int FindGcd(int n,int m) {
		int i=0;
		int res=0;
		while(i<=Integer.max(n, m))
		{
			i++;
			if((n%i==0)&&(m%i==0))
			{
				res=i;
				
			}

			
			
		}
		return res;
			
	}
		 


	public static void main(String[] args) {
		int n=4,m=32;
		
		System.out.println(FindGcd(n,m));

	}

}
