package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
public class StringValueConversionANdSum {
	
	public static int letteredNumberSum(char []cst,int l) {
		
		int sum=0;
		if(l==0)
		{
			return 0;
		}
		for(int i=0;i<l;i++)
		{
			char ch=cst[i];
			switch(ch)
			{
			
			default:
			{
				sum+=0;
			}
			case 'A':
			{
				sum+=1;
				break;
			}
			
			case 'B':
			{
				sum+=10;
				break;
			}
			case 'C':
			{
				sum+=100;
				break;
			}
			case 'D':
			{
				sum+=1000;
				break;
			}
			case 'E':
			{
				sum+=10000;
				break;
			}
			case 'F':
			{
				sum+=100000;
				break;
			}
			case 'G':
			{
				sum+=1000000;
				break;
			}
			
			}
			
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char [] cst=str.toCharArray();
		
		System.out.println(letteredNumberSum(cst,cst.length));
		
		}
	}


