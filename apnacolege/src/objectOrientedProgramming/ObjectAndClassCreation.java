

package objectOrientedProgramming;

public class ObjectAndClassCreation {

	
	public static void main(String[] args) {
		
		
		Pen p1=new Pen();
		p1.setColor("red");
		System.out.print(p1.color);
	}
	



	
	static  class Pen{
		String color;
		int tip;
		
		void setColor(String newColor){
			
			color=newColor;
		}
		
		void setTip(int newTip) {
			tip=newTip;
			
		}
		
	}	
		
	static class Student{
		String name;
		int roll;
		float percentage;
		
		void calcPercentage(int phy,int chem,int math)
		{
			percentage=(phy+chem+math)/3; 
		}
	}
	
}