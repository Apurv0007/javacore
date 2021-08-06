package multiThreading;
class callme1{
	void call(String msg) 
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		     }
		catch(InterruptedException e) 
	     	{
			System.out.println("Interrupted");
	  	  }
		System.out.println("]");
	    }
       }
class caller2 implements Runnable{
	String msg;
	callme1 target;
	Thread t;
	public caller2(callme1 targ,String s) 
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run() 
	{
		synchronized(target) 
		{
			target.call(msg);
		}
	}
}
public class Synchreo_Statement 
{
	public static void main(String args[]) 
	{
	callme1 target=new callme1();
	caller2 ob1=new caller2(target,"hello");
	caller2 ob2=new caller2(target,"synchronized");
	caller2 ob3=new caller2(target,"World");
	try 
	{
		ob1.t.join();
		ob2.t.join();
		ob3.t.join();
	}
	catch(InterruptedException e) 
	{
		System.out.println("Interrupted");
	}
}
}