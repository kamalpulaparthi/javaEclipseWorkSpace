package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.lang.Math.*;
public class decimalTobinary {

	public static void main(String[] args) {
		
//		1. METHOD 1
		
		
		int n=21,r;
		int h=n;
//		ArrayList<Integer> hit=new ArrayList<Integer>();
//		while(h>0)
//		{
//			r=h%2;
//			hit.add(r);
//			h=h/2;
//		}
//		
//Collections.reverse(hit);
//		System.out.println(hit);
		
		// 2.METHOD 
		
	StringBuilder sb=new StringBuilder();
	
	while(h>0)
		{
			r=h%2;
			sb.append(r);
			h=h/2;
		}
	System.out.println(sb.reverse());
	}

}
