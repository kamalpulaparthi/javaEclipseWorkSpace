package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][] arr= new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		
		
		int [][] arr1= {{2,2,2},
						{2,2,2},
						{2,2,2}}; 
		
		int [][]arr3=new int [3][3];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr3[i][j]=arr[i][j]*arr1[i][j];
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr3[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
