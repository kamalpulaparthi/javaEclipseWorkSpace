package testnew;
import java.util.*;


public class DeciToBinary {
	int r;
	
	
	public static int DeciToBinary(int n){
		int r;
		
	int bin=0;
	int i=0;	
		while(n>0) 
		{
			r=n%2;
			bin=bin+(int)(r*Math.pow(10, i));
			System.out.println(bin);
			n=n/2;
			i++;
			
		}
		
		return bin;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=DeciToBinary(n);
		
		System.out.println(res);
	}

}
