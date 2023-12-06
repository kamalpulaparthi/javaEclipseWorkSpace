package asciiTableQuestions;
import java.util.*;
public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int x=sc.nextInt();
		while(x>0)
		{
			int r=x%10;
			sum+=r;
			x=x/10;
		}
		System.out.println("sum of digits the number:"+sum);
	}

}
