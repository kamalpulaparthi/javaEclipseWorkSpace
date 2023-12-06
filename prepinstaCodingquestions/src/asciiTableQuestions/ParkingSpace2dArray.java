package asciiTableQuestions;

public class ParkingSpace2dArray {

	public static void main(String[] args) {
int [][]arr= {{1,1,0,1,},{0,0,0,0},{1,1,1,1}};
int count=0;
int max=0;int num=0;
for(int i=0;i<3;i++)
{
	 count=0;
	for(int j=0;j<4;j++)
	{
		if(arr[i][j]==1)
		{
			count++;
			System.out.println(count);
		}
	}
	if(max<count)
	{
		max=count;
		num=i+1;
	}
}
System.out.println("the row with highest '1's' is  "+num+""+" with count "+ count);
	}

}
/* A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s

Example 2:
input :
4 -> Value of R(row)
3 -> Value of C(column)
[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
Output :
4  -> Row 4 has maximum number of 1’s */