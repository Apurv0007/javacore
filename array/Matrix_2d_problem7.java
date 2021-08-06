package array;

import java.util.Scanner;

public class Matrix_2d_problem7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements of matrix A");
		
        int a[][]=new int [3][3];
        int b[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=sc.nextInt();
			}
        	}
        System.out.println("martix elemennt A");
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        	}
        System.out.println("---------------------");
    	System.out.println("Enter the array elements of matrix B");
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
				System.out.print("b["+i+"]["+j+"]=");
				b[i][j]=sc.nextInt();
			}
        	}
     System.out.println("------------------");
        System.out.println("martix elemennt B");
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		System.out.print(b[i][j]+" ");
        	}
        	System.out.println();
        	}
       int c[][]=new int[3][3];
       for (int i = 0; i < 3; i++) {
       	for (int j = 0; j < 3; j++) {
       		c[i][j]=a[i][j]*b[i][j];
       	}
       
       	
       	}
    System.out.println("--------------------");
   	System.out.println("product of matrix A and B ");
    for (int i = 0; i < 3; i++) {
       	for (int j = 0; j < 3; j++) {
       		System.out.print(c[i][j]+" ");
       	}
    	System.out.println();
       	}
       
	}

}
