package array;

import java.util.Scanner;

public class Matrix_2d_problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
System.out.println("Enter the array elements");
        int arr[][]=new int [3][3];
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
				System.out.print("arr["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
        	}
        System.out.println("martix element are");
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        	}
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		if(i>j) {
        			sum=sum+arr[i][j];
        		}
        	}
        	}
System.out.println("sum of lower triangular matrix  is :\t"+sum);
	}

}
