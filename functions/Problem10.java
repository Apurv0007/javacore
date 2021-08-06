//WAP accept three digit number from user and display sume.g(123->1+2+3=6)...... ( parameter and return)
package functions;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		s=sum_of_digit(n);
		System.out.println("sum of digits :"+s);
		
	}
	static int sum_of_digit(int n) {
		int sum=0,d=0;
		while(n>0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}

}
