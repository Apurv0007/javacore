//WAP accept the temp in fer and convert in cel.........(Parameter and return)
package functions;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in farenhite");
		double n=sc.nextDouble();
		double t;
	      t=temp_in_celcius(n);
	      System.out.println("temp in celcius is "+t);
		
	}
	static double temp_in_celcius(double n) {
		double celsius;
		celsius=(n-32)*5/9;
		
	
		return celsius;
	}    
	

}
