package accenture_coding;
import java.util.*;
public class ListOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		
		String [] arr=str.split(" ");
		
		Arrays.sort(arr);
		
		
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		int l=arr.length;
		
		//System.out.println(arr[3]);
		
for(int i=0;i<l;i++)
{
	String star=arr[i];
	
	
	if(star.charAt(0)==ch)
	{
		System.out.println(star+" "+(i+1));
	}
}
	
	}

}
