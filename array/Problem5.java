//WAP that takes 10 no. from user and display alternate no.
package array;

import java.util.Scanner;

public class Problem5 {

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
        System.out.println("alternate number from the given array is");
        for (int i = 0; i < num.length; i+=2) {
        	System.out.println(num[i]);
			
		}
	}
	

}
