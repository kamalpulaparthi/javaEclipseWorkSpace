package practiceWordTabularquestionsOnNoSysArrayString;

public class PrimePalindrome {

	public static void main(String[] args) {
		String str="23532";
		int k=str.length();
		int i=0;
		StringBuilder sb=new StringBuilder();
		while(i<k)
		{
			int ch=str.charAt(i);
			for(int j=2;j<ch;j++)
			{
				if(ch%j!=0)
				{
					System.out.println("in valid input");
					break;
				}
			}
			sb.append(ch);
			i++;
		}
		//String strr=sb.toString();
//		if(sb==sb.reverse())
//		{
//			System.out.println("yes prime palindrome"+sb.reverse());
//			
//		}

	}

}
