package accenture_coding;
import java.util.*;
public class StringOperations {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String str=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		
		char ch=sc.next().charAt(0);
		char []carr=str.toCharArray();
		
		String[]sarr=str.split(" ");
		
		for(String i:sarr)
		{
			sb.append(i);
		}
		
		String star=sb.toString();
		
		char []carr2=star.toCharArray();
		
		for( int i:carr2)
		{
			
		}
		
		
		
		
		
		

	}

}
