package cool;
import java.util.*;
public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		String str="abcabcbb";
		char [] ch=str.toCharArray();
//		for(char i:ch)
//		{
			System.out.print(str);
//		}
			int max=0;
			int count=0;

			int n=ch.length;
			
			for(int i=0;i<n;i++)
			{
				count=0;
				for(int j=i+1;j<n;j++)
				{
					for(int k=i;k<=j;k++)
					{
						count++;
						if(ch[j]==ch[k])
						{
							break;
						}
					}
					if(count>max)
					{
						max=count;
					}
					break;
				}
				
					
			}
			System.out.println(max);
	}

}
