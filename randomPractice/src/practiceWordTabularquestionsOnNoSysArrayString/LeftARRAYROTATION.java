package practiceWordTabularquestionsOnNoSysArrayString;

import java.util.Scanner;

public class LeftARRAYROTATION {

	public static void main(String[] args) {
		int []arr= {22,44,33,55,66,77,88,99,00};
		int []brr=new int[arr.length];
		Scanner sc= new Scanner(System.in);
		int p=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=arr[(i+p)%arr.length];
		}
		
		for(int i:brr)
		System.out.print(i+" ");

	}

}
