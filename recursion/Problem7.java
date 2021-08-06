//WAP display the sum of 1st 10 No
package recursion;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number ");
		   int n=sc.nextInt();
		 
		   System.out.println("summition first "+n+" no. is "+sum(n));
		   }
	static int sum(int n) {
		if(n==0)
			return n;
		else
			return n+sum(n-1);
	}

}
