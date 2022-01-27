package Method.programs;

public class MethodOverloading {

	public void area(int b,int h)
    {
		double l = 0.5;
         System.out.println("Area of Triangle : "+(l*b*h));
    }
    public void area(int r) 
    {
    	double k = 3.14;
         System.out.println("Area of Circle : "+(k*r*r));
    }

    public static void main(String args[])
   {

    	MethodOverloading ob=new MethodOverloading();
       ob.area(10,12);
       ob.area(5);  
   }

}
