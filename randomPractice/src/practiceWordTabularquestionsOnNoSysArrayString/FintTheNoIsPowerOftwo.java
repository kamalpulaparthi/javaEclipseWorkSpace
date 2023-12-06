package practiceWordTabularquestionsOnNoSysArrayString;

public class FintTheNoIsPowerOftwo {

	public static void main(String[] args) {
		float n=2147483647;
		float i=0;
		while(n!=1 && n>0)
		{
			n=n/2;
			
			i++;
		}
		if(n==1)
			System.out.println("yes its power of 2");
		else
			System.out.println("no its not the power of two");

	}

}
