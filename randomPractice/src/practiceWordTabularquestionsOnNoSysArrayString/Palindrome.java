package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.lang.String;
public class Palindrome {

	public static void main(String[] args) {
		String str="Was it a*^& car or a cat i ,saw";
		
	str.toUpperCase();
	String str1=str.replaceAll("\\s","");
	String strr=str1.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(str1);	
	System.out.println(strr);
	//	str.trim();
	char [] ch=	strr.toCharArray();
	
	
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<strr.length();i++)
		{
			sb.append(strr.charAt(i));
		}
		System.out.println(sb);
		System.out.println(sb.reverse());
		String hit,bit;
		hit=sb.toString();
		sb.reverse();
		bit=sb.toString();
		String hitt=hit.toUpperCase();
		String bitt=bit.toUpperCase();
		
		if(hitt.equals(bitt))
		{
			System.out.println(" palindrome"+"    "+hitt+"  "+bitt);
		}
		else 
			System.out.println("  not palindrome"+"  "+hitt+"  "+bitt);
	}
	
	
	
	

}
