package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.util.ArrayList;
public class Countsetbitsinaninteger {

	
	public static void main(String []args) {
		
		Integer [] hit= {0,0,1,1,1}; 
		ArrayList<Integer> bin= new ArrayList<Integer>( Arrays.asList(hit));
		Collections.reverse(bin);
		int sum=0;
		for(int i=0;i<bin.size();i++)
		{
			if(bin.get(i)==1)
			{
				sum+=Math.pow(2, i);
			}
		}
		System.out.println(sum);
	}
}
