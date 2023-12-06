package accenture_coding;
import java.util.*;


public class Question1 {
	
	static int change(char one,char two)
	{
		char c1=one;
		char c2=two;
		Character.toLowerCase( c1);
		Character.toLowerCase( c2);
		 int s= (c1-'a'+1)-(c2-'a'+1);
		 if(s<0)
		 {
			 return -(s);
		 }
		 else
		 {
			 return s;
		 }
		
				 
	}

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
			Scanner sc =new Scanner(System.in);
			String str=sc.nextLine();
			String arr[]=str.split(" ");
			int l=arr.length;
//			for(String i:arr)
//			{
//				System.out.println(i);
//			}
			
			
			for(int i=0;i<l;i++)
			{
				int sum=0;
				int t=arr[i].length();
				
				for(int j=0;j<t/2;j++)
				{
					sum=sum+change(arr[i].charAt(j),arr[i].charAt(t-j-1));
					//System.out.println(sum);
					
				}
				if(t%2==1)
				{
					double k=Math.ceil(t/2);
					char u=Character.toLowerCase(arr[i].charAt((int) k));
					//System.out.println(u);
					sum=sum+(u-'a'+1);
				}
				
				sb.append(sum);
			}
			System.out.println(sb.toString());
	}

	
	}


