package Method.programs;

public class MethodExecution {

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {
		
		//create an object for MethodExcution class
		MethodExecution b=new MethodExecution();
		// call the method by using object and return the result to ans variable
		int ans= b.multipynumbers(10,3);
		//print the value
		System.out.println("Multipilcation is :"+ans);
		}
}
