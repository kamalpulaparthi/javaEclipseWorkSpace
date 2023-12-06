package kamalproject;

public class NoOfPrime {

	public static void main(String[] args) {
		int i=2,j,n=10,count=0,flag;
		while(n>1) {
			flag=0;
			for(j=2;j<i;j++) 
			{
				
				if (i%j ==0) 
				{
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println(i);
				count++;
			}
			i++;
			if (count==n) {
				break;
			}
		}

	}

}
