package bitManipulation;

public class ClearIbitsInRange {

	public static void main(String[] args) {
		int n=127,i=2,j=7;
		
		int b=((1<<i)-1);
//		 1111-  2^4-1=15 ==>2^i-1
//		  111-	2^3-1=7	 ==>2^i-1
//		   11-	2^2-1=3	 ==>2^i-1
		System.out.println(b);
		System.out.println();

	}

}
