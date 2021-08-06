package multiThreading;
class aa extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("from aa class i = "+i);
		}
	}
}
class bb extends Thread
{
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("from bb class j = "+j);
		}
	
	}
}
class cc extends Thread
{
	public  void run() {
		for(int k=1;k<=5;k++) {
			System.out.println("from cc class k = "+k);
		}
	}
}

public class ClassProb_1 {

	public static void main(String[] args) {
		
	
		new aa().start();
		new bb().start();
		new cc().start();
	

	}

}
