//WAp accept 10 no from user and display only odd no.
package array;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rray length");
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<num.length;i++) {
			System.out.print("arr["+i+"]=");
			num[i]=sc.nextInt();
			
		}
		for(int j=0;j<num.length;j++) {
			
			System.out.print(num[j]);
			System.out.println();
			}
		System.out.println("odd are");
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2!=0) {
				System.out.print(num[i]+"  ");
			}
			
		}
 

	}

}
