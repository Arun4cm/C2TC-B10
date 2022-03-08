package programming;
public class threadcounter implements Runnable 
{
	     static int count = 1; 
	     static void incCount() 
	     {
	          System.out.println(Thread.currentThread().getName() + ": " + count);
	          count++;
	     }

	     public void run() 
	     {
	          while(count<11)
	          {
	               incCount();
	          }
	     }

	     public static void main(String[] args) 
	     {
	          threadcounter tc = new threadcounter();
	          Thread t1 = new Thread(tc);
	          Thread t2 = new Thread(tc);
	          t1.start();
	          t2.start();          
	     }
}


