//WAP accept any no from user and display the no number is perfect or not no parameter and  no return value............
package functions;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		perfect();

	}
          static void perfect() {
	    Scanner sc=new Scanner(System.in);
	    int sum=0;
	    System.out.println("Enter te number ");
	    int n=sc.nextInt();
	   for(int i=1;i<=n/2;i++) {
	    	if(n%i==0) {
	    		sum+=i;
	    	}
	    	
	     }
	    if(sum==n) {
	    	System.out.println("perfect no.");
	    }else {
	    	System.out.println("not perfect");
	    }
}

}
