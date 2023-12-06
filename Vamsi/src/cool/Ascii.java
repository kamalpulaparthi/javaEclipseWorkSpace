package cool;
//
//1 Write a Java program to check if a given string contains only ASCII characters or not.
//2 Write a Java program to count the number of uppercase letters, lowercase letters, digits, and special characters in a given string using ASCII values.
//3 Write a Java program to find the largest and smallest ASCII value in a given string.
//4 Write a Java program to convert a given binary string to its ASCII equivalent.
//5 Write a Java program to check if a given character is a vowel or not using ASCII values.
//6 Write a Java program to count the number of occurrences of a given character in a given string using ASCII values.
//7 Write a Java program to reverse the order of characters in a given string using ASCII values.
//8 Write a Java program to convert a given character to its ASCII value using bitwise operators.
//9 Write a Java program to sort a given string in ascending order of ASCII values.
//10  Write a Java program to check if two given strings are equal or not using ASCII values.






public class Ascii {

	public static void main(String[] args) {
		
		//	topic 1 .Widening or implicit type casting:
		
//		String ch="appletree";
//		String ch1="mangotree";
//		
//		String m="";
//		int c=0;
//		int n=ch.length();
//		m=m+ch.charAt(0)+ch1.charAt(1);
//		
//		for(int i=1;i<n ;i++)
//		{
//			
//			m=m+ch.charAt(i+c)+ch1.charAt(i+c+1);
//			System.out.println(m);
//		c++;
//		}
//		System.out.println(m);
		
		
//		char c='d';
//		int n=c;
//		System.out.println(n);
		
		
		//	topic 2.Narrowing or explicit type casting: 
		
		//In this example, the int value is 65535, which is the maximum value that can be represented by a char data type. However, when we cast it to a char, the result is not predictable and depends on the implementation of the Java virtual machine. In this case, the output is a question mark '?' because the char value is outside the range of printable ASCII characters.
		
		
		int n = 65535;
		char c = (char) n;
		System.out.println(c); // output: ?
		
		
		// topic 3 .Narrowing or explicit type casting:
//		
//		int num =98;
//		char ch= (char)num;
//		System.out.println(ch);
		
		

	}

}
