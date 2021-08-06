//WAP display the factroial of any number given by user
package recursion;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr no.");
		int n=sc.nextInt();
		int f;
		f=fact(n);
		System.out.println("factorial of "+n+"is "+f);
		}
	
	static int fact(int n) 
	{
		if(n==1) {
			return 1;
		} 
		else 
		{
			return n*fact(n-1);
		}
	}

}
