package bitManipulation;
import java.util.*;
public class CheckingPowerIs2 {
	
	public static int powerCheck(int n) {
		int m=n-1;
		if((n&m)==0)
		{
			return 1;
		}
		else
			return 0;
		
	}

	public static void main(String[] args) {
		int n=32;
		int res=powerCheck(n);
		if(res==1)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
