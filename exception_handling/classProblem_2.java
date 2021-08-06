package exception_handling;
class aa2{
	int arr[]=new int[35];
	void disp() {
		try {
			arr[42]=445;
		System.out.println("value of arr[42] ="+arr[42]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			}
		finally
		{
			System.out.println("this message is from finally Block");
		}
	}
}

public class classProblem_2 {

	public static void main(String[] args) {
		  aa2 ob=new aa2();
		  ob.disp();

	}

}
