package multiThreading;
class Thread_a extends Thread{
	
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
class Thread_b extends Thread{
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
		
	}
}

public class ExtendingThread {

	public static void main(String[] args) {
		Thread_a a=new Thread_a();
		Thread_b b=new Thread_b();
		a.start();
		b.start();
	
		

	}

}
