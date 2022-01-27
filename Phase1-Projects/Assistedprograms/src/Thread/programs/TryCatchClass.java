package Thread.programs;

public class TryCatchClass {

	public static void main(String args[]) 
    {
        int[] a = new int[3];
        try 
        {
        	a[0] = 10;
        	a[1] = 20;
        	a[2] = 30;
            a[4] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + a.length);
        }
    }


}
