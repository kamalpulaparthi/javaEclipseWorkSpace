package evening;
import java.util.*;
public class SolidRhombus {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		{
//			double k=Math.ceil(n/2);
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
				System.out.println();
			
		}

	}

}
