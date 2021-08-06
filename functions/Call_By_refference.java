package functions;

import java.util.Scanner;

public class Call_By_refference {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.println("enter the 10 number");
	for(int i=0;i<10;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("array element before function");
	for(int i=0;i<10;i++) {
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
	disp(arr);
	System.out.println("\nArray element after function");
	for(int i=0;i<10;i++) {
		System.out.print(arr[i]+" ");
	}

	}
	static void disp(int arr[]) {
		int l=arr.length;
		for(int i=0;i<l;i++) {
			arr[i]=arr[i]+2;
		}
		System.out.println("array element inside function");
		for(int i =0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
