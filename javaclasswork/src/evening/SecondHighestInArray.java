package evening;

public class SecondHighestInArray {
	static void find(int []arr,int m)
	{
		int i,j;
		int n=arr.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		System.out.println("the"+m+"th"+"element in the array is"+arr[n-m]);
	}
	public static void main(String[] args) {
		int [] arr= {37,26,38,1,44};
		System.out.println("enter the number of element to be printed");
		int m=2;
		find(arr,m);
	}

}
