package evening;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		String str="i need hiphens in place of space";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the new string:");
		String str1=sc.nextLine();
		System.out.println(str1);
		System.out.println("string concatnation without spaces:");
		 int l=str1.length();
		 char space=' ';
		String str2="";
		for(int i=0;i<l-1;i++)
		{
			if(str1.charAt(i)!=space) {
				str2=str2+str1.charAt(i);
			}
			
			
		}
		System.out.println(str2);
		}

}
