package arrays;

public class PairsInArray {
	public static void printPair(int list[]) {
		int curr=0;
		
		for(int i=0;i<list.length;i++)
		{
			  curr = list[i];
		
		for(int j=i+1;j<list.length;j++)
		{
			System.out.print("("+curr+","+list[j]+")");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int list[]= {2,3,4,5,6};
		printPair(list);
	}

}
