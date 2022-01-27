package Thread.programs;

public class ExtendingThread extends Thread{
	
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
    }
 	public static void main( String args[] )
 	{
 		ExtendingThread mt = new  ExtendingThread();
  		mt.start();
 	}
}
	


