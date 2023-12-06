package evening;

public class Rhombus {

	public static void main(String[] args) {
		int n=7;
		int s=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n+1-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			
			s++;
			for(int j=1;j<n;j++)
			{
				System.out.print(" ");
			}
			
				System.out.println();
			
		}
		int t=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<n+1-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			
			t++;
			for(int j=1;j<n;j++)
			{
				System.out.print(" ");
			}
			
				System.out.println();
			
		}

	}

}
