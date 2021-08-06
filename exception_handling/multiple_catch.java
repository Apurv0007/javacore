package exception_handling;
class aa4{
	int a=20,b=0;
	int arr[]=new int[30];
	void get() 
	{
		try 
		{
			arr[45]=a/b;
			System.out.println("value of arr[45] ="+arr[45]);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) 
		{
		System.out.println(e2);
		}
		finally 
		{
			System.out.println("This message is from final block");
		}
	}
	
}

public class multiple_catch {

	public static void main(String[] args) {
		aa4 ob=new aa4();
		ob.get();

	}

}
