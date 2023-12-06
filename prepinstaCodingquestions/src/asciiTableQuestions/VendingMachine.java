package asciiTableQuestions;
import java.util.*;
public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int num=sc.nextInt();
		
		String[] c= {"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};

		String[] a={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};		String[] t= {"plain","cappuchino","latte"};
		String[] s={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
		String[] b={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
		
		if(str.equals("c"))
		{
			for(int i=0;i<3;i++)
			{
				if(num==i+1)
				{
					System.out.println("welcome to cc enjoy your "+c[i]);
				}
			}
		}
		if(str.equals("a"))
		{
			for(int i=0;i<8;i++)
			{
				if(num==i+1)
				{
					System.out.println("welcome to cc enjoy your "+a[i]);
				}
			}
		}
		if(str.equals("s"))
		{
			for(int i=0;i<4;i++)
			{
				if(num==i+1)
				{
					System.out.println("welcome to cc enjoy your "+s[i]);
				}
			}
		}
		if(str.equals("b"))
		{
			for(int i=0;i<3;i++)
			{
				if(num==i+1)
				{
					System.out.println("welcome to cc enjoy your "+b[i]);
				}
			}
		}
	}

}
