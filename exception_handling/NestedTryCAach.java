package exception_handling;
class aa5{
	int a=40,b=0,c=0;
	int arr[]=new int[30];
	void get() {
		try {
			try {
				c=a/b;
				System.out.println("result :"+c);
			}
			catch(ArithmeticException e1)
			{
				System.out.println(e1);
			}
			arr[45]=986;
			System.out.println("value of arr[45]="+arr[45]);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		finally {
			System.out.println("This is an example of nested try and catch");
		}
	}
}

public class NestedTryCAach {

	public static void main(String[] args) {
	aa5 ob=new aa5();
	ob.get();

	}

}
