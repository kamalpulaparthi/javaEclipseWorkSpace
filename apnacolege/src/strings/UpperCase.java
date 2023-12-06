package strings;
import java.lang.String;
public class UpperCase {
	public static String convertUpper(String str) {
		int l=str.length();
		StringBuilder sb=new StringBuilder("");
		char ch=Character.toUpperCase(str.charAt(0));
		sb.append(ch);
				for(int i=1;i<l;i++)
		{
			if(str.charAt(i)==' ' && i<l)
			{
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
				return sb.toString();
	}

	public static void main(String[] args) {
		
		String str="it is fine here";
		System.out.println(convertUpper(str));

	}

}
