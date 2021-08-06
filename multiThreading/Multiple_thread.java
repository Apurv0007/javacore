package multiThreading;
class abc implements Runnable{
	String name;
	Thread t;
	abc(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("Name thread :"+t);
		t.start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println(name+" :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(name+"Interrupted");
		}
		System.out.println(name+" exiting");
	}
	
	
}

public class Multiple_thread {

	public static void main(String[] args) {
		new abc("One");
		new abc("Two");
		new abc("Three");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main threadn existing");
		
	}

}
