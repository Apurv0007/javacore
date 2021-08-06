package exception_handling;
class aa3{
	void disp() {
		int arr[]=null;
		try {
			System.out.println("length of array "+arr.length);
		}
		catch(NullPointerException e) {
			System.out.println(e);
			}
		finally
		{
			System.out.println("This message is from finally block");
		}
	}
}

public class NullPoint {

	public static void main(String[] args) {
	aa3 ob=new aa3();
	ob.disp();

	}

}
