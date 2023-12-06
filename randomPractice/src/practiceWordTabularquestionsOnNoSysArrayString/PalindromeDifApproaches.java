package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class PalindromeDifApproaches {

	public static void main(String[] args) {
		String str="Wa s it a*^& ca  r or a cat i ,saw";
//		String str1=str;
//		StringBuilder sb=new StringBuilder();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char a=str.charAt(i);
//			if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>=0 && a<=9))
//			{
//				sb.append(a);
//			}
//		}
//		String hit,bit;
//		hit=sb.toString();
//		sb.reverse();
//		bit=sb.toString();
//		String hitt=hit.toUpperCase();
//		String bitt=bit.toUpperCase();
//		
//		if(hitt.equals(bitt))
//		{
//			System.out.println(" palindrome"+"    "+hitt+"  "+bitt);
//		}
//		else 
//			System.out.println("  not palindrome"+"  "+hitt+"  "+bitt);
//		
		
		
		char []ch=str.toCharArray();
		char [] ch1=new char[ch.length];
		int j=0;
//		for(int i=ch.length;i>0;i--)
//		{
//			char a=ch[i];
//			
//			if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>=0 && a<=9))
//			{
//				ch1[j]=ch[i];
//			}
//			j++;
//		}
		 
		
		if(Arrays.equals(ch, ch1))
		{
			System.out.println(" palindrome");
		}
		else 
			System.out.println("  not palindrome");

	}

}
