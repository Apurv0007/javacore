//WAP that accepts a 3x3 matrix and display the sum of coloumns
package array;

import java.util.Scanner;

public class Matrix_2d_problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the element of matrix");
		int arr[][]=new int [3][3];
		for (int i = 0; i < 3 ;i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("arr["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Matrix element are");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
            System.out.println("sum of coloumns");
            for (int j= 0; j < 3; j++) {
				int SumOfColumns=0;
				for (int i = 0; i < 3; i++) {
					SumOfColumns=SumOfColumns+arr[i][j];
				}
				System.out.println("sum of "+(j+1)+" coloumn :"+SumOfColumns);
			}
	}

}
