package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.util.ArrayList;
import java.lang.Math.*;
public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		String str="10111";
		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<str.length();i++)
//		{
//			sb.append(str.charAt(i));
//		}
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
//		String str1=sb.toString();
//		System.out.println(str1);
//		char[]arr=str1.toCharArray();
//		Double sum=0.0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]=='1')
//			{
//				System.out.println();
//				Double a=Math.pow(2,i);
//				sum=sum+a;
//				System.out.println(sum);
//			}
//		}
//		
//		System.out.println(sum);
		
		
		
		ArrayList<Character> sit= new ArrayList<Character> ();
		char[]arr=str.toCharArray();
		for(char i:arr)
		{
			sit.add(i);
		}
		
		System.out.println(sit);
		Collections.reverse(sit);
		System.out.println(sit);
		int sum=0;
		for(int i=0;i<sit.size();i++)
		{
			if(sit.get(i)=='1')
			{
				
				sum+=Math.pow(2, i);
				
			}
		}
		System.out.println(sum);
	}

}
