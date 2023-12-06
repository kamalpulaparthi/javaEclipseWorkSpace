package strings;

import java.lang.Math;

public class Displacement {

	public static void main(String[] args) {
		String str="WNEENESENNNNN";
		int i,x1=0,y1=0,x2,y2,count=0,count2=0,a,A,B,b;
		float disp;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='N')
			{
				count++;
			}
			else if(str.charAt(i)=='S')
			{
				count--;
			}
			else if(str.charAt(i)=='E')
			{
				count2++;
			}
			else
			{
				count2--;
			}
		}
		x2=count;
		y2=count2;
		a=(x2-x1);
		b=(y2-y1);
		A=a*a;
		B=b*b;
		 disp=(float) Math.sqrt(A+B);
		System.out.println(disp);
	}

}
