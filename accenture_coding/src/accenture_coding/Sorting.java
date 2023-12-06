package accenture_coding;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {5,8,11,44,7,1,2};
		int temp;
		int n=arr.length;
		
		for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
    	    {
                if (arr[i] > arr[j])
    	        {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    	    }
        }
//for(int i=0;i<n-1;i++)
//{
//	for(int j=0;j<n-1-i;j++)
//	{
//		if(arr[j]>arr[j+1])
//		{
//			temp=arr[j];
//			arr[j]=arr[j+1];
//			arr[j+1]=temp;
//		}
//	}
//}

for(int i:arr)
{
	System.out.println(i);
}
	}

}
