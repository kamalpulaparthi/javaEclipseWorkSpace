package strings;

public class LargestInStringSet {

	public static void main(String[] args) {
		String fruits[]= {"apple","mango","banana"};
		String largest=fruits[0];
		for(int i=0;i<fruits.length;i++)
		{
			if(largest.compareTo(fruits[i])<0)	// .campareToIgnoreCase is used for igoring case sensitivity
			{
				largest=fruits[i];
			}
		}
		System.out.println(largest);
		
	}

}
