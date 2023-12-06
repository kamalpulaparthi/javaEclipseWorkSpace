package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.lang.Math;
public class CheckIfANumberIsPowerOf2 {

	public static void main(String[] args) {
		int n=256;
		int i=0;
		while(i>=0)
		{
			if(n==Math.pow(2, i))
			{
				System.out.println("yes");
				break;
			}
			else if(Math.pow(2, i)>n)
			{
				System.out.println("no");
				break;
			}
			i++;
		}

	}

}
