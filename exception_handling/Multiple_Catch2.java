package exception_handling;

public class Multiple_Catch2 {

	public static void main(String[] args) {
		try
		{
			int a=args.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]= {1};
			c[42]=99;
		}
		catch(ArithmeticException e1) {
			System.out.println("Division by zero : "+e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("array index oob :"+e2);
		}
		System.out.println("After try/catch blocks.");
	

	}

}
