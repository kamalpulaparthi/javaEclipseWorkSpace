package accenture_coding;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		int l=str.length();
		int f, count=0;
		
		int len=0,cap=0,sma=0,spe=0,num=0,con=0,mount=0;
		if(l>=6 && l<=22)
		{
			len++;
		}
		
		
		for(int i=0;i<l;i++)
		{
			char a=str.charAt(i);
			
			
			
				if((Character.isUpperCase(a)))
				{
		
					cap++;
				}
				
					
				if((Character.isLowerCase(a)))
				{
					
				sma++;
				
				}
				
				
				if((a=='@' || a=='!' && a=='&' || a=='^' || a=='%' || a=='*' || a=='#'))
				{	spe++;
					

				}
				
				
				if((a>='0' && a<='9'))
				{
				
					num++;
					
				}
				
				
				
		}
		
		for(int i=1;i<l;i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				con++;
				
			}
		}
		
		f=0;
		
		if(num==0)
		{
			count++;
			f=1;
		}
		if(len==0)
		{
			count++;
			f=1;
		}
		if(cap==0)
		{
			count++;
			f=1;
		}
		if(sma==0)
		{
			count++;
			f=1;
		}
		if(spe<2)  
		{
			count++;
			f=1;
		}
		if(con>0)
		{
			count++;
			f=1;
		}
		
		
		
		// num>0 && len>0 && spe>=2 && sma>0 && cap>0 && con==0
		
		if(f==0 )
		{
		
		System.out.println(0);
		}
		else
		{
			System.out.println(count);
		}
	}

}
