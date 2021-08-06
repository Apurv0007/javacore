////WAp accept 10 no from user and count how many no are odd and even in it.
package array;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of array u want");
		int n=sc.nextInt();
		int b[]=new int[n];
		for (int i = 0; i < b.length; i++) {
			System.out.print("arr["+i+"]=");
			b[i]=sc.nextInt();
			
			}
		
		for (int j = 0; j < b.length; j++) {
			
			System.out.println(b[j]);
			}
		System.out.println("even number are");
		for (int i = 0; i < b.length; i++) {
			if(b[i]%2==0) {
				System.out.print(b[i]+" ");
				}
			
			}
		System.out.println("\nodd number are");
		for (int i = 0; i < b.length; i++) {
			if(b[i]%2!=0) {
				System.out.print(b[i]+" ");
			}
			
		}
		
		}

	}


