package strings;

public class FindSameChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="****efiwgfbjebfdgfwaefhah;oivv####";
		int count=0;
		int count2=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='*')
	{
	 count++;
	}
	if(str.charAt(i)=='#')
	{
	 count2++;
	}
	
	
}
if(count==count2)
{
 System.out.print("valid");
}
else
{
	System.out.print("not valid");
}
	}

}
