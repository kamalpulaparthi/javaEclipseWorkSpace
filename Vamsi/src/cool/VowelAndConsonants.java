package cool;
import java.util.*;
public class VowelAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		sc.close();
//System.out.println(ch);
		
		if(Character.isUpperCase(ch))
			System.out.println(	Character.toLowerCase(ch));
		switch(ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
		}
		
		StringBuilder sb=new StringBuilder();
		String str="apple";
		String str1=str.toUpperCase();
		String str2=str.substring(0,2).toUpperCase();
		
		System.out.println(str2);
		
		
		sb.append(str);
		sb.reverse();
		sb.insert(2,'d');
		sb.delete(0, 1);
		System.out.println(sb.toString()); 
		
		//System.out.println(sb);
		//toUpperCase(str.charAt(2));
		
		
		
	}

}
