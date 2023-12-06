package asciiTableQuestions;
import java.util.*;
public class PartyCruiseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		int[]E= new int[T];
		int[]L= new int[T];
		int sum=0;
		int max=0;
		for(int i=0;i<T;i++)
		{
			System.out.println("enter element of entering array:");
			E[i]=sc.nextInt();
			System.out.println("enter element of leaving array:");
			L[i]=sc.nextInt();
			sum=sum+E[i]-L[i];
			if(max<sum)
			{
				max=sum;
			}
			
		}
		System.out.println(max);
	}

}
