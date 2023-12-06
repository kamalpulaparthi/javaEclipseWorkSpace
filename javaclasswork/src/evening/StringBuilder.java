package evening;
import java.util.*;
public class StringBuilder {

	public static void main(String[] args) {
		System.out.println("enter the new string:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println(str1);
		
		Integer a=10;	/* int a=10; is wrong because object has to be 
							created for toString()	
								method for converting any primitive data types to string */
		a.toString();
		System.out.println(a);
		
//		char ch='w';			/* char a='w'; is wrong because object has to be 
//							created for toString()	
//							method for converting any primitive data types to string */																				
//		ch.toString();
//		System.out.println(ch);
	}

}
