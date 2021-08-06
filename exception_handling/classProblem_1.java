package exception_handling;
class aa1{
	int a=20,b=0;
	void disp() {
		try {
		int c=a/b;
		System.out.println("Rzesult :"+c);
	}
		catch(ArithmeticException e){
			System.out.println("div by zero");
			
		}
		}
}

public class classProblem_1 {

	public static void main(String[] args) {
		
aa1 ob=new aa1();
ob.disp();
	}

}
