//taking user input.
package opps;

import java.util.Scanner;

class aa4{
	int a,b,c;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		 a=sc.nextInt();
		 b=sc.nextInt();
		
	}
	void cal() {
		c=a+b;
	}
	void put() 
	{
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		System.out.println("sum of two numbers:"+c);
		
	}
}

public class Class_problem4 {

	public static void main(String[] args) {
		aa4 ob= new aa4();
		ob.get();
		ob.cal();
		ob.put();
				
	

	}

}
