package Method.programs;

public class CallByMethod {

	int val=15;

	int operation(int val) {
		this.val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		
		CallByMethod d = new CallByMethod();
		System.out.println("Before operation value of data is "+d.val);
		// call the method and pass the new value ,this value is assigned to that previous variavle val
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
}
