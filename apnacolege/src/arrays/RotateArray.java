package arrays;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter no of rows:  ");
	int r=sc.nextInt();

	System.out.println("enter no of COLUMNS:  ");
	int c=sc.nextInt();
	
		// TODO Auto-generated method stub
int [][]arr=new int[r][c];
System.out.println("enter matrix:  ");

for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		arr[i][j]=sc.nextInt();
	}
//	System.out.println();
}	
	System.out.println("entered matric");
	
for(int k=0;k<r;k++)
{
	for(int j=0;j<c;j++)
	{
		System.out.print(arr[k][j]+" ");
	}
	System.out.println();
}

int [][]temp=new int[r][c];


for(int i1=0;i1<c;i1++)
{
	for(int j=0;j<r;j++)
	{
		temp[j][r-i1-1]=arr[i1][j];
	}
	
}
System.out.println("rotated matrix");

for(int i1=0;i1<c;i1++)
{
	for(int j=0;j<r;j++)
	{

		System.out.print(temp[i1][j]+"   "); 
	}
	System.out.println();
}
	}

}
