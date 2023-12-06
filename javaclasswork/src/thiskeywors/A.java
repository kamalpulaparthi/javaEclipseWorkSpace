package thiskeywors;

import java.util.*;

		// 1. referring current object inside a method or constructor

//public class A {
//	 
//	A(){
//		System.out.println(this);
//	}
//		
//		
//	
//
//	public static void main(String[] args) {
//		A r = new A();
//		System.out.println(r);
//	}
//
//}

//
//output:	thiskeywors.A@3cb5cdba
//			thiskeywors.A@3cb5cdba

 //		2. whenever the instance and local variable have same name jvm confuses avout 
//		which one local variable("this key word solves this problem|"

public class A {
	 
	A(){
		System.out.println(this);
	}
		
		
	

	public static void main(String[] args) {
		A r = new A();
		System.out.println(r);
	}

}
	
	