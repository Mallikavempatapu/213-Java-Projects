package AccessSpecifier.programs;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 


public class AccessSpecifier1 {

	public static void main(String[] args) {
		
		System.out.println("Dafault Access Specifier");
		//create an object of defAccessSpecifier class
		
		defAccessSpecifier obj = new defAccessSpecifier(); 
		
		// this obj will call the default accessspecifier method display()
        obj.display(); 


	}

}
