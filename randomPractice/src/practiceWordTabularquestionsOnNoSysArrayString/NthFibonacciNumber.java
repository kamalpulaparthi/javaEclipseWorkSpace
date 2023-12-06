package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> hit=new ArrayList<Integer>(); 
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(n3%2==0)
			System.out.print(n3+" ");
			
			System.out.println(n3+" ");
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			sum+=n3;
			hit.add(n3);
		}
		System.out.println(n3);
		
		System.out.println("sum of series"+" "+sum);
		Collections.reverse(hit);
		System.out.println("the reverse n fibo numbers"+hit);
	}

}
