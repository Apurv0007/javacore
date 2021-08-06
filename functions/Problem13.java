//WAP accept the temp in cel and convert in fer.........(Parameter and return)
package functions;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in  celcius");
		double n=sc.nextDouble();
		double t;
	      t=temp_in_fernhite(n);
	      System.out.println("temp farenhite is "+t);
		}
	static double temp_in_fernhite(double n) {
		double farenhite;
		farenhite=n*9/5+32;
		
	
		return farenhite;
	}    

}
