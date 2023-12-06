package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.lang.Math.*;
public class BallsRequiredInEachRow {
	
	public static int totalBallsrequired(int []arr,int n) {
		
		int sum=0;
		if(n==0)
		{
			return 0;
		}
		
		for(int i=0;i<n;i++)
		{
			sum+=Math.pow(i+1, 2)-arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(totalBallsrequired(arr,n));

	}

}
