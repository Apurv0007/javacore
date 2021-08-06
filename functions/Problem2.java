//WAP accept any no from user and display the number is prime or not no parameter and  no return value.....
package functions;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		prime_no();
			
}
	static void prime_no()
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("enter the number");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("given no.is prime");
		}else {
			System.out.println("not prime");
		}
		
	}

}
