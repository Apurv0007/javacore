//WAP accept number form user and check weather  the number is prime or not.....(parameter and return)
package functions;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	int p=prime_no(n);
	if(p==2) {
		System.out.println("prime no.");
	}
	else {
		System.out.println("not prime");
	}
}
	static int prime_no(int n){
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
			
		}
		
		
		
		return c;
			}
	
	

}
