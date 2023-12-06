package asciiTableQuestions;
import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		k=k%n;
		int[]arr=new int[n];
	
	int[]rot=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<k;i++)
	{
		rot[i]=arr[n-k+i];
	}
	int index=0;
	for(int i=k;i<n;i++)
	{
		rot[i]=arr[index++];
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(rot[i]);
	}
	
	
	}
}
