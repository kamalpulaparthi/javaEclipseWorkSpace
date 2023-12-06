package arrays;

public class Recyclearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list[ ]= { 22,33,44,55,66,77,88,99 };
		int aux[]=new int [8];
		int l=list.length;
		int n=2,k=0;
		for(int i=l-1;i>=l-n;i--)
		 {
			aux[k]=list[i];
			System.out.print(aux[k]+",");
			k++;
		 }
		
		for(int i=0;i<l-n;i++)
		{
			aux[n+i]=list[i];
			
			
		}
		
		for(int j=0;j<l;j++)
		 {
			System.out.print(aux[j]+" ,"); 
		 }
		 
	}

}
