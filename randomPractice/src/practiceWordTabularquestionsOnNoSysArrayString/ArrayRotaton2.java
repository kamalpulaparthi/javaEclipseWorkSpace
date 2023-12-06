package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;

import java.util.ArrayList;
public class ArrayRotaton2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer []fit= {23,45,34,67,12,32,54,76};
		Integer []git=new Integer [fit.length];
		int k=sc.nextInt();
			
			for(int i=0;i<fit.length;i++)
			{
				git[((i+k)%fit.length)]=fit[i];
			}
			//System.out.println(git);
			ArrayList<Integer> hit= new ArrayList<Integer>(Arrays.asList(git));

			System.out.println(hit);
			
	}

}
