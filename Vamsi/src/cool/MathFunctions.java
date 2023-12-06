package cool;
import java.util.*;
import java.math.*;
public class MathFunctions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double m=sc.nextDouble();
		double s=sc.nextDouble();
		long t=sc.nextLong();
		long u=sc.nextLong();
		System.out.println(Math.pow(n, m));
		System.out.println(Math.min(n, m));
		System.out.println(Math.max(n, m));
		System.out.println(Math.abs(u));
		System.out.println(Math.floor(s));
		System.out.println(Math.ceil(s));
	}

}
