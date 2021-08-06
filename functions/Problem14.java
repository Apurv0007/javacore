//WAP accept number form user and check  weather the number is palindrome or not(parameter and return value)
package functions;

import java.util.Scanner;



public class Problem14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p;
		p=palindrome(n);
		if(p==n) 
	System.out.println("palindrome no is : "+p);
		else
			System.out.println("number is not palindrome");
}
	static int palindrome(int n) {
		int rev=0,d=0;
	     
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		
		
		return rev;
	}

}
