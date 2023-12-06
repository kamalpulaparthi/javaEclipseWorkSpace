package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class MoveZerosTOlast {

	public static void main(String[] args) {
		double []arr= {0,0,0,00,3,4,0,5,};
		double []brr=new double[arr.length];
		Scanner sc= new Scanner(System.in);
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==0)
					{
					double temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					}
				}
			
		}
		for(double i:arr)
		System.out.print(i+" ");

	}

}
