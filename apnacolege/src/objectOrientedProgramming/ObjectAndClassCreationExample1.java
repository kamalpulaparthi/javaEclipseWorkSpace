package objectOrientedProgramming;

public class ObjectAndClassCreationExample1 {

	public static void main(String[] args) {
		
Laptop l1=new Laptop();
l1.memory=512;
System.out.println(l1.memory);

	}

	
	static class Laptop{
		String name;
		int memory;
		
		void works(int updateMem)
		{
			memory=updateMem;
		}
	}
	
	static class phone{
		String model;
		int ram;
		
		void work(int newRam)
		{
			ram=newRam;
		}
	}


}