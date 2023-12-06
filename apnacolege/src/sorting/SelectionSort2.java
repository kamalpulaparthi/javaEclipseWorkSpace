package sorting;
import java.util.*;
public class SelectionSort2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Integer arr[]= {6,4,99,1,0};
		
		for(Integer i=0;i<arr.length-1;i++)
		{
			Integer minpos=i;
			for(Integer j=i+1;j<arr.length;j++)
			{
				if(arr[minpos]>arr[j])
				{
				minpos=j;
				}
				
			}
			
			Integer temp=arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(int a:arr)
		{
			System.out.println(a);
		}

		
	}

}
