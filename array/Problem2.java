//WAp accept 10 no from user and display only even no.
package array;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much no u want to print");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]=");
			a[i]=sc.nextInt();
		}for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
		System.out.println("even number in given array are");
for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0) {
		System.out.println(a[i]);
	}
	
}
	}

}
