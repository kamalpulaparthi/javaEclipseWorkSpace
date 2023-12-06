package testnew;
import java.util.*;


public class BinaryDeci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
				
		int count=0;
		int r;
		int dec=0;
		int temp=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		for(int i=0;i<=count;i++)
		{
			r=temp%10;
			dec=(int) (dec+r*(Math.pow(2, i)));
			temp=temp/10;
			
		}
		System.out.println(dec);
	}

}
