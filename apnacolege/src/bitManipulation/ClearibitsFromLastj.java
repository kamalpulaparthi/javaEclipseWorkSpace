package bitManipulation;

public class ClearibitsFromLastj {

	public static void main(String[] args) {
		int n=15;
		int i=3;
		int m=(n&(~1)<<i);
		System.out.println(m);

	}

}
