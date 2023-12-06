package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class MaxElementsInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enete total no of elements in an array");
	//	int e=sc.nextInt();
		
		double max=Integer.MIN_VALUE;
		double min=Integer.MAX_VALUE;
		//int []arr=new int[e];
		double []arr1= {0,400,897,-3,8,99,3,234};
		double  temp=0;
		double  temp1=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max)
			{
				temp=max;
				max=arr1[i];
				arr1[i]=temp;
			}
			
		}
		for(int i=0;i<arr1.length;i++)
		{
			
			if(arr1[i]<min)
			{
				temp1=arr1[i];
				
				arr1[i]=min;
			}
		}
		System.out.println(max+" "+min);

	}

}
