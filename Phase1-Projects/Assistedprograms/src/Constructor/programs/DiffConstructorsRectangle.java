package Constructor.programs;

public class DiffConstructorsRectangle {

	public int length;
	public int width;
	// default constructor
	DiffConstructorsRectangle()
	{
		System.out.println("default constructor");
	}
	// Parameterized constructor
	DiffConstructorsRectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public void getArea()
	{
		 System.out.println(" Rectangle Area is : "+length*width);
	}
	public static void main(String[] args) 
	{
		// this 2 objects are called parameterized constructors
		DiffConstructorsRectangle r1=new DiffConstructorsRectangle(20,12);
		DiffConstructorsRectangle r2=new DiffConstructorsRectangle(6,2);
		
		// this obj is called default constructor
		DiffConstructorsRectangle r3 = new DiffConstructorsRectangle();
		r1.getArea();
		r2.getArea();

		
	}
}
