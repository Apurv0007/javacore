package multiThreading;
class vari{
	int i,j,k;
}
class aaa extends vari implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("from aaa class i = "+i);
		}
	}
}
class bbb extends vari implements Runnable{
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("from aaa class j = "+j);
		}
	}
}
class ccc extends vari implements Runnable{
	public void run() {
		for(int k=1;k<=5;k++) {
			System.out.println("from ccc class k = "+k);
		}
	}
}

public class ClassProb_2 {

	public static void main(String[] args) {
		aaa ob1=new aaa();
		bbb ob2=new bbb();
		ccc ob3=new ccc();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		Thread t3=new Thread(ob3);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
