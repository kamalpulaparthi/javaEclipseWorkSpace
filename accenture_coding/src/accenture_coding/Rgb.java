package accenture_coding;
import java.util.*;
public class Rgb {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);

int r=sc.nextInt();
int g=sc.nextInt();
int b=sc.nextInt();
r=255-r;
g=255-g;
b=255-b;
System.out.println(r+" "+g+" "+b);
	}

}
