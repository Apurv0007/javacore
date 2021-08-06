package exception_handling;

public class Exc2{
	public static void main(String[] args) {
		int a,d;
		
		try {
			d=0;
			a=42/d;
			System.out.println("This willl not be printed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
			
		}
		System.out.println("After Catch");
	}

}
