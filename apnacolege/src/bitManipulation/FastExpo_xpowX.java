package bitManipulation;

public class FastExpo_xpowX {
	public static int calci(int x)
	{
		int ans=1;
		int n=x;
		while(n>0)
		{
		if((n&1)!=0)
		{
			ans*=x;
		}
		x*=x;
		n=n>>1;
		}
	return ans;	
	}

	public static void main(String[] args) {
		int x=3;
		System.out.println(calci(x));

	}

}
