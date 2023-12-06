package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class CheckAnagram {
	
	public static boolean check(String str1,String str2)
	{
		String str11=str1.replaceAll("\\s","").toLowerCase();
		String str22=str2.replaceAll("\\s","").toLowerCase();
		
		System.out.println(str11);
		System.out.println(str22);
		char[]arr1=str11.toCharArray();	char[]arr2=str22.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length!=arr2.length)
			return false;
		
		if(Arrays.equals(arr1, arr2))
			return true;
		else
			return false;	
	}
	public static void main(String[] args) {
		String str1="listen";
		String str2="IlSt eN";
		
		
		
		
		boolean bin=check(str1,str2);
		if(bin)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}

}
