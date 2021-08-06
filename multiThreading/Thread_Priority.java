package multiThreading;
class aa1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class bb1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}
}
class cc1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
	}
}

public class Thread_Priority {

	public static void main(String[] args) {
		aa1 ob1=new aa1();
		bb1 ob2=new bb1();
		cc1 ob3=new cc1();
		ob1.setPriority(2);
		ob2.setPriority(10);
		ob3.setPriority(5);
		ob1.start();
		ob2.start();
		ob3.start();
		
	}

}
