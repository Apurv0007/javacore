package multiThreading;
class aab implements Runnable{
	String name;
	Thread t;
	aab(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread :"+t);
		t.start();
	}
	public void run() {
	try {
		for(int i=5;i>0;i--) {
			System.out.println(name+":"+i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException e) {
		System.out.println(name+"Intrrupted.");
	}
	System.out.println(name+" exiting.");
}}

public class DemoJoin {

	public static void main(String[] args) {
		aab ob1=new aab("One");
		aab ob2=new aab("Two");
		aab ob3=new aab("Three");
		System.out.println("Thread one is alive :"+ob1.t.isAlive());
		System.out.println("Thread two is alive :"+ob2.t.isAlive());
		System.out.println("Thread three is alive :"+ob3.t.isAlive());
		try {
			System.out.println("Waiting for thread to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread is interrupted");
				}
		System.out.println("Thread one is alive :"+ob1.t.isAlive());
		System.out.println("Thread two is alive :"+ob2.t.isAlive());
		System.out.println("Thread three is alive :"+ob3.t.isAlive());
		System.out.println("Main thread existing");
	}

}
