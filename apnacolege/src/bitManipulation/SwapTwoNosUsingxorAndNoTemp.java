package bitManipulation;

public class SwapTwoNosUsingxorAndNoTemp {

	public static void main(String[] args) {
		int x=3,y=4;
		y=x^y;
		x=x^y;
		y=y^x;
		System.out.println(x);
		System.out.println(y);
		

	}

}
