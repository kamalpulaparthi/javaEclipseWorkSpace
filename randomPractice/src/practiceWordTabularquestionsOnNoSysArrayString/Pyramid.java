package practiceWordTabularquestionsOnNoSysArrayString;

public class Pyramid {

	public static void main(String[] args) {
		 int n=5;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=n;j>i;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=0;k<(2*i)+1;k++)
			 {
				 System.out.print(i+1);
			 }
			 System.out.println();
		 }

	}

}
