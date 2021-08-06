//WAP display the square of 1st 10 numbers
package recursion;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		System.out.println("square of 1st 10 number is :");
		
		disp(1);

	}
	static void disp(int i) {
		if(i<=10) {
			System.out.print(i*i+ " ");
			disp(i+1);
		}
	}

}
