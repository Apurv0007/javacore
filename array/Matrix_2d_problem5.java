package array;

import java.util.Scanner;

public class Matrix_2d_problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		
        int arr[][]=new int [3][3];
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
				System.out.print("arr["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
        	}
        System.out.println("martix elemennt before transpose");
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        	}
System.out.println("matrix element after transpose");
for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
		System.out.print(arr[j][i]+" ");
	}
	System.out.println();
	}
	}

}
