package arrays;

//public class PrintSubArray {
//	
//	public static void printSubarray(int list[]) {
//		int curr=0;
//		int totalsubarrays=0;
//		
//		for(int i=0;i<list.length;i++)
//		{
//			  int start = i;
//		
//		for(int j=i+1;j<list.length;j++)
//		{
//			int end=j;
//			for(int k=i;k<j;k++)
//			{
//				
//				System.out.print(list[k]+" ");
//				totalsubarrays++;
//			}
//			System.out.println();
//		}
//		System.out.println();
//		}
//		System.out.println("total sub arrays: "+totalsubarrays);
//	}
//
//	public static void main(String[] args) {
//		int list[]= {2,3,4,5,6};
//		printSubarray(list);
//	}
//
//}


//	 finding sum of sum of sub arrays and min and max also // model 2 

public class PrintSubArray {
	
	public static void printSubarray(int list[]) {
		int curr=0;
		int totalsubarrays=0;
		int sum=0;
		for(int i=0;i<list.length;i++)
		{
			  int start = i;
		
		for(int j=i+1;j<=list.length;j++)
		{
			int end=j;
			for(int k=i;k<j;k++)
			{
				
				System.out.print(list[k]+" ");
				sum=sum+list[k];
				totalsubarrays++;
			}
			System.out.println();
		}
		System.out.println();
		}
		System.out.println("total sub arrays: "+totalsubarrays);
	}

	public static void main(String[] args) {
		int list[]= {2,3,4,5,6};
		printSubarray(list);
	}

}
