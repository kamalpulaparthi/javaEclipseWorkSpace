package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class FirstNonrepeatedCharacter {

	public static void main(String[] args) {
		String str="aabbcc";
int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(str.charAt(i));
				break;
			}
			else
			{
				System.out.println("no none characters repeated");
				break;
			}
				
			
		}
	}
	
	

}
