package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;
		if(n==1)
			System.out.println("0");
		else if(n==2)
			System.out.println("1");
		while((n-2)>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			n--;
		}
		System.out.println(n3);
	}

}
