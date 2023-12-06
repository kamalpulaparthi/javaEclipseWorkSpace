package testnew;
import java.util.*;

public class AdvancedPatterns {
	
	
	public static void hollowCylinder(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 || i==r || j==1  || j==c)
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

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int rows =sc.nextInt();
		System.out.println("enter number of rows:");

		int columns =sc.nextInt();
		
		hollowCylinder(rows,columns);
	}

}
