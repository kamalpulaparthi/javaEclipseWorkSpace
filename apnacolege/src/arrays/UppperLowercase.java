package arrays;

public class UppperLowercase {

	public static void main(String[] args) {
	String str="a ball in a car";
int l=	str.length();
char ch=' ';

for(int i=0;i<l;i++)
{
	ch=str.charAt(i);
	if(ch==' ')
	{
		ch=(char) (str.charAt(i+1)+26);
	}

}
System.out.println(ch);
}
}