package practiceWordTabularquestionsOnNoSysArrayString;
import java.util.*;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer []fame= {1,2,3,4,5};
		ArrayList<Integer> name=new ArrayList<Integer>(Arrays.asList(fame));
		//System.out.println(name);
		Integer []parr=name.toArray(new Integer[name.size()]);
		System.out.print(parr);
		for(Integer i:parr)
		{
			System.out.print(i.intValue());
		}
//		Collections.reverse(name);
//		Collections.sort(name);
//		//System.out.println(name.add(sc.nextInt()));
//		System.out.println(name.add(0));
//		System.out.println(name.remove(4));
//		name.clear();
//		
		
		
		System.out.println(name.isEmpty());
	}

}
