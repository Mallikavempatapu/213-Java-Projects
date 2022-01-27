package InnerClass.Programs;

public class InnerClass2 {

	private String msg="Inner Classe with in the another Inner class method";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	 
	public static void main(String[] args) {
		InnerClass2  ob=new InnerClass2 ();  
		ob.display();  
		}

}
