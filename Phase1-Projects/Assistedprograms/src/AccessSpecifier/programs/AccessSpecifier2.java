package AccessSpecifier.programs;
class privateaccessspecifier 
{ 
	private void display() 
	{ 
		System.out.println("You are using private access specifier"); 
		int a =10;
		int b = 12;
		int c = a+b;
	} 
}

public class AccessSpecifier2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		privateaccessspecifier  obj = new privateaccessspecifier(); 
		        //trying to access private method of another class 
		//we are unable to access the Private accessSpecifier method,why because that is private method. 
		      // obj.display();
		        //System.out.printLn("the c value is:"+obj.c);

			}
		}


