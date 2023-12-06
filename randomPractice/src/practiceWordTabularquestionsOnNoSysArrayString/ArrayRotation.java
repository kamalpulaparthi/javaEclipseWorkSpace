package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter position:  s");
		int k=sc.nextInt();
		
		int [] arr= {88,33,44,7,83,68,974,21};
		int l=k%arr.length;
		int []brr=new int [arr.length];
		//int [] crr= new int [arr.length];
		int j=0;
		for(int i=arr.length-l;i<=arr.length-1;i++)
		{
			brr[j]=arr[i];
			j++;
		}
		int t=0;	
		for(int i=l;i<brr.length;i++)
		{
			brr[i]=arr[t];
			t++;
		}
		for(int i:brr)
		{
			System.out.print(i+" ");
		}
	}

}
