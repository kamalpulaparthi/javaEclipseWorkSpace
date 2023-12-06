package theoryCodingQuestions;
import java.util.*;

public class CostOfPainting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		float sum=0;
		float sum1=0;
		
		float []arr=new float[(int) a];

		float []arr1=new float[(int) b];
		if(a!=0)
		{
			
		
		for(int i=0;i<a;i++)
		{
		arr[i]=sc.nextFloat();	
		}

		for(int i=0;i<a;i++)
		{
		sum=sum+(arr[i]*18);
		}
		System.out.println(sum);
		}
		
		if(b!=0)
		{
			
		
		for(int i=0;i<b;i++)
		{
		arr1[i]=sc.nextFloat();	
		}

		for(int i=0;i<b;i++)
		{
		sum1=sum1+(arr1[i]*12);
		}
		
		System.out.println(sum1);
		}
		
		System.out.println("Total estimated cost:"+(sum+sum1)+"INR");
	}

}
/*
 * Question 5
Problem Statement

We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example
*/
