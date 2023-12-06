package patterns;

public class PalindromicPyramid {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=1;k--)
			{

				System.out.print(k);
//				if(k==1)
//				{
//					while(k<=i)
//					{
//						System.out.println(k);
//						k++;
//					}
//				}
//				
			}
			System.out.println();
	}

}
}