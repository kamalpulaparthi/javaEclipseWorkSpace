package practiceWordTabularquestionsOnNoSysArrayString;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;;
//import java.util.Collections;
public class GcdOfmultipleNumbersInArray {

	public static void main(String[] args) {
		
		Integer [] bin= {33,44,55,66};
		ArrayList<Integer> hit= new ArrayList<Integer>(Arrays.asList(bin));
//		for(int i:bin)
//		System.out.println(i);
//		Collections.reverse(hit);
//		System.out.println(hit);
//		for(int i:hit)
//			System.out.println(i);
		
		
		int h=Collections.max(hit);
//		System.out.println(h);
		int res=0;
		for(int i=1;i<=h;i++)
		{
			int count=0;
			for (int j=0;j<hit.size();j++)
			{
				if(hit.get(j)%i==0)
				{
					count++;
				}
				 if(count==hit.size())
				 {
					 res=i;
				 }
			}
		}
		System.out.println(res);
	}

}
