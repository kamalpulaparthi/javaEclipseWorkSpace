package objectOrientedProgramming;

import objectOrientedProgramming.ObjectAndClassCreation.Pen;

public class GettersAndSetters {

	public static void main(String[] args) {

		Pen p1=new Pen();
		p1.setColor("red");
		System.out.print(p1.color);
	}
	
}


	
	static  class Pen{
		String color;
		int tip;
		
		String getColor()
		{
			return this.color;//this keyword refers to the current object which called getcolor function
		}
		
		int getTip()
		{
			return this.tip;
		}
		
		void setColor(String newColor){
			
			this.color=newColor;
		}
		
		void setTip(int tip) {
			this.tip=tip;
			
		}
		
	}	
		
	
	
