package evening;

public class Butterfly {

	public static void main(String[] args) {
		int n=8;
		String h=" ";
		for(int i=1;i<=(n/2)-1;i++)
		{
			int s=i;
			for(int j=i+1;j<=n-s;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			System.out.print(h);
			

	}

}
}