package practiceWordTabularquestionsOnNoSysArrayString;

public class Array90Rotation {

	public static void main(String[] args) {
		char [][]arr= {{'a','b','c'},
				      {'d','e','f'},
				      };
		
		
		char [][]brr=new char[3][3];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				brr[j][2-i-1]=arr[i][j]; // 2=no of rows
			}
			
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(brr[i][j]);
			}
			System.out.println();
		}
	}

}
