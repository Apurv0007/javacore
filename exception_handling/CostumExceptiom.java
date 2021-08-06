package exception_handling;

import java.util.Scanner;

class aa6{
	void disp(String nm) throws Exception
	{
		if(nm.equals("Srk"))
		{
			throw new Exception("Wanted");
		}
		else if(nm.equals("Apurv")) 
		{
			throw new Exception("ITER student");
			
		}
		else if(nm.equals("priyanshu"))
		{
			throw new Exception("UTER student");
		}
		else 
		{
			System.out.println("OKKKKKK");
		}
	}
}

public class CostumExceptiom {

	public static void main(String[] args) {
		
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		aa6 ob=new aa6();
		try
		{
			ob.disp(name);
		}
		catch(Exception e1) {
			System.out.println(e1+" ");
		}

	}

}
