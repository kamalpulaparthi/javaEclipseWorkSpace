package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class NoOfCarries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int s=0;
		int count=0;

		while(n>0&&m>0)
		{
			int r1=n%10;
			int r2=m%10;
			int j=r1+r2;
			s=j/10;
			if(j/10>0)
			{
				count++;
			}
			n=n/10;
			m=m/10;
			j=s;
		}
		
		System.out.print(count);
	}

}
