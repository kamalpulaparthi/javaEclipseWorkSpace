package cool;
import java.util.*;
public class DecodingString {

	public static void main(String[] args) {
		String str="leet2code3";
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		String str1;
		for(int i=0;i<str.length();i++)
		{
			char r=str.charAt(i);
			
			if(!Character.isDigit(r))
			{
				
				sb.append(r);
				
				
			}
			else if(Character.isDigit(r))
			{
				int n=(int)r;
				for(int j=0;j<n-1;j++)
				{
					sb1.append(sb);
					
				}
				sb.setLength(0);
				sb.append(sb1);
				sb=sb1;
				
				
			}
			
		}
		
		
	}

}
