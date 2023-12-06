package sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class InbuiltSorting {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Integer n=sc.nextInt();
		Integer arr[]= new Integer[n];
		for(Integer i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder() );
		for(Integer a:arr)
		{
			System.out.println(a);
		}
	}

}
