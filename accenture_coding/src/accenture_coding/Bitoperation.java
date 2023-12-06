package accenture_coding;
import java.util.*;

public class Bitoperation {
	public static int action(String str,int n)
	{
		int res=0;
		if(str==null)
			return -1;
		
		res=str.charAt(0)-'0';
		for (int i = 1; i < str.length ();)
	      {
		char prev = str.charAt (i);
		  i++;
		if (prev == 'A')
		  res = res & (str.charAt (i) - '0');
		else if (prev == 'B')
		  res = res | (str.charAt (i) - '0');
		else
		    res = res ^ (str.charAt (i) - '0');
		  i++;
	      }
	    return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		int n=str.length();
		
		System.out.println(action(str,n));
		
		
	}

}
