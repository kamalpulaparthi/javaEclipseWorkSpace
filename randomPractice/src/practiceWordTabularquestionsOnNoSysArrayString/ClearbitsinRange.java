package practiceWordTabularquestionsOnNoSysArrayString;

public class ClearbitsinRange {

	public static void main(String[] args) {
		int n=127;
		int i=2,j=6;
		
		int a=(~0)<<j;
		int b=(1<<i)-1;
		int c=a|b;
		System.out.println(n&c);
		
		

	}

}
