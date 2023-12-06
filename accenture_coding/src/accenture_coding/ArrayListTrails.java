package accenture_coding;
import java.util.*;
public class ArrayListTrails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> one=new ArrayList<Integer>();
		one.add(3);
		one.add(1,2);
		for(int i:one)
		{
			System.out.println(i);
		}
		
		
		Integer[] array = one.toArray(new Integer [one.size()]);
		
		ArrayList<Integer> odd=new ArrayList<Integer>(Arrays.asList(array)); 
		
	}

}
