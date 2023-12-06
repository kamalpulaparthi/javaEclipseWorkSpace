package practiceWordTabularquestionsOnNoSysArrayString;

public class StringHasAllUniqueCharacters {

	public static void main(String[] args) {
		String str="!@%^&*";
		char[]arr=new char[str.length()];
		char[]arr1=new char[str.length()];
		StringBuilder sb=new StringBuilder();
		char ch;
		for(int i=0;i<str.length();i++)

		{
			ch=str.charAt(i);
			
			if(((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>=0 &&ch<=9)))
			{
				System.out.println("invalid input");
				break;
			}
			else
				arr[i]=ch;
			
		}
		if(str.length()==arr.length)
		{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
									
			}
			if(count>1)
				break;
			
			 if(count==1)
					arr1[i]=arr[i];

			
			
		}
		}
		
		if(arr.length!=arr1.length)
		{
			System.out.println("string ha s all unique characters");
		}
		else 
			System.out.println("no string ha not all unique characters");
		
	}

}
