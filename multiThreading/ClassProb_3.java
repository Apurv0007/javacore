package multiThreading;
class a1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("from aa class i="+i);
			if(i==3) {
				Thread.yield();
			}
		}
	}
}
class b1 extends Thread{
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("from b1 class j="+j);
			if(j==3) {
			stop();
			}
		}
	}
}
class c1 extends Thread{
	public void run() {
		for(int k=1;k<=5;k++) {
			System.out.println("from c1 class k="+k);
			if(k==3) {
				try {
					Thread.sleep(2000);
		
				}catch(InterruptedException e1) {
					System.out.println(e1);
				}
			}
		}
	}
}

public class ClassProb_3 {

	public static void main(String[] args) {
	new a1().start();
	new b1().start();
	new c1().start();

	}

}
