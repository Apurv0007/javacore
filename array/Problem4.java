//WAP that takes 10 no. from user and print it in reverse order
package array;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the arary");
         int n=sc.nextInt();
         int num[]=new int[n];
         for(int i=0;i<n;i++) {
        	 System.out.print("arr["+i+"]=");
        	 num[i]=sc.nextInt();
         }
         for(int j=0;j<n;j++) {
        	 System.out.println(num[j]);
         }
         System.out.println("in reverse");
         for (int i =num.length-1; i >=0; i--) {
        	 System.out.println(num[i]);
			
		}
	}

}
