//WAP accept any no from user and display factorial with NO parameter and  NO return value.....
package functions;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	
	fact();
	     
	}
	static void  fact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long fact = 1;
		
		int n=sc.nextInt();
		for(long i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	
	}
}
