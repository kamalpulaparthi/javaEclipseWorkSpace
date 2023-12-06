package cool;

public class swap {

	public static void main(String[] args) {
		int a=3;
		int b=5;
//		a=a+b; //without using third variable
//		b=a-b;
//		a=a-b;
		
		a=(a*b);//without using third variable
		b=a/b;
		a=a/b;
		
//		int temp;// using third variable
//		 temp=b;
//		 b=a;
//		 a=temp;
		 System.out.println(b+"  "+a);
	}

}
