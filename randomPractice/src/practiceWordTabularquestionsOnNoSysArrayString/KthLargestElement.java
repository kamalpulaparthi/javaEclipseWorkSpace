package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class KthLargestElement {

	public static void main(String[] args) {
		int []arr= {22,44,33,55,66,77,88,99,00};
		//int []brr=new int[arr.length];
		Scanner sc= new Scanner(System.in);
		int p=sc.nextInt();
		Arrays.sort(arr);
		
		
		for(int i:arr)
		{System.out.print(i+" ");}
		
		System.out.println();
		System.out.println(arr[arr.length-p]);

	}

}
