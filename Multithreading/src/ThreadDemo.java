class A extends Thread
{
	public void run() 
	{
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
	}
}
class B extends Thread 
{
	public void run() 
	{
		System.out.println("Current ID of B:" + Thread.currentThread().getId());
	}
}

class C extends Thread 
{
	public void run() 
	{
System.out.println("Current ID of C:" + Thread.currentThread().getId());
	}
}

class D implements Runnable
{
public void run() 
{
System.out.println("Current ID of D:" + Thread.currentThread().getId());
}

public void setPriority(int maxPriority) {
	// TODO Auto-generated method stub
	
}

public void start() {
	// TODO Auto-generated method stub
	
}
}

public class ThreadDemo 
{
	public static void main(String[] args) 
	{ 
		// TODO Auto-generated method stub
			A a = new A();
			a.setPriority(Thread.MIN_PRIORITY);
			a.start();
			
			B b = new B();
			b.setPriority(Thread.MIN_PRIORITY);
			b.start(); 
			
			C c = new C();
			c.setPriority(Thread.MAX_PRIORITY); 
			c.start();
			
			D d = new D();
			d.setPriority(Thread.MAX_PRIORITY); 
			d.start();
			Thread th = new Thread(d); 
			th.start();
			
			System.out.println("Current ID of main:" + Thread.currentThread().getId());
			

	}
}