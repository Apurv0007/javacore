//WAP accept any no from user and display the reverse no parameter and  no return value............
package functions;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		reverse();

	}
	static void reverse() {

       Scanner sc=new Scanner(System.in);
       int rem,rev=0;
       System.out.println("Enter the number");
       int num=sc.nextInt();
       while(num!=0) {
    	   rem=num%10;
    	   rev=rev*10+rem;
    	   num=num/10;
       }
       System.out.println("reverse  "+rev);
    	  }
	}