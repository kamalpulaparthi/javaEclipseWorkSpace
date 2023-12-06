package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.lang.Math.*;
public class ArmStrongNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in) ;
		int n=0;
		int k=n;
		int c=0;
		while(k>0)
		{
			c++;
			k=k/10;
		}
		int l=n;
		int sum=0;
		while(l>0)
		{
			int r=l%10;
			sum+=Math.pow(r, c);
			l=l/10;
			
		}
		if(sum==n)
		System.out.println("yes armstrong");
		else
			System.out.println("not armstrong");

	}

}
