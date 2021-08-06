package array;

import java.util.Scanner;

public class Matrix_2d_problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows =sc.nextInt();
        System.out.println("Enter the number of coloumns : ");
        int cols=sc.nextInt();
         int matrix[][]=new int[rows][cols];
         System.out.println("Enter the array elements");
         for (int i = 0; i < rows; i++) {
        	 for (int j = 0; j < cols; j++) 
        	 {
        		 System.out.print("arr["+i+"]["+j+"]=");
        		 matrix[i][j]=sc.nextInt();
				}
			}
         System.out.println("elements of matrix");
         for (int i = 0; i < rows; i++) {
        	 for (int j = 0; j < cols; j++) {
        		 System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
       if(rows!=cols) {
    	   System.out.println("not symmetric matrix");
       }
       else {
    	   boolean symmetric=true;
    	   for (int i = 0; i < rows; i++) {
          	 for (int j = 0; j < cols; j++) 
          	 {
          		 if(matrix[i][j]!=matrix[j][i])
          		 {
          			 symmetric = false;
          			 break;
          		 }
          	 }
          	 
          	 }
    	   if(symmetric) {
    		   System.out.println("the given is symmetric matrix");
    }
    	   else {
    		   System.out.println("not symmetric");
    	   }
       }
       sc.close();
}
	}


