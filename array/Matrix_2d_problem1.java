//WAP that accepts a 3x3 matrix and display the sum of rows.
package array;

import java.util.Scanner;

public class Matrix_2d_problem1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	System.out.println("Enter the matrix element");
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			System.out.print("arr["+i+"]["+j+"]=");
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("matrix elements are");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
	System.out.println("sum of rows");
	for (int i = 0; i < 3; i++) {
		 int sumOfRow=0;
		for (int j = 0; j < 3; j++) {
			sumOfRow=sumOfRow+arr[i][j];
			
		}
		System.out.println("sum of "+(i+1)+" rows :"+sumOfRow);
		
		
	}
		
	}
		}
	

	


