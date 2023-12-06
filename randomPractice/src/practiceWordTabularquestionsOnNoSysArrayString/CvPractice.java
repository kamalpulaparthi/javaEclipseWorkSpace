package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class CvPractice {

	public static void main(String[] args) {
		int []arr= {3,4,-1,1,5};
		
		int k=3;
		ArrayList<Integer> brr=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int d=0;

			for(int j=i;j<i+k-1 && j<arr.length-k;j++)
			{
				
					d=Math.max(d,arr[j]);
			}
			brr.add(d);
		}
		
		System.out.println(brr);

	}

}
