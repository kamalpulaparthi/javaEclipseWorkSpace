package evening;

import java.util.Scanner;

public class EqualsMethod {

	public static void main(String[] args) {
		System.out.println("enter the new string:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("enter the second string:");
		String str2=sc.nextLine();
		
		
				//.equals() always give s a boolean value either true or false
		if(str1.equalsIgnoreCase(str2)) {	//.equals() does care about the case while running
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are  not equal");
		}
	}

}
