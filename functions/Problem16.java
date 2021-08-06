//WAP accept the distance in km and convert it in m........(Parameter and return) 
package functions;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance km :");
		double n=sc.nextDouble();
	   double m;
	   m=distance_in_meter(n);
	   System.out.println("distance in meter     :"+m);
	}
	static double distance_in_meter(double n) {
		double m;
		m=n*1000;
		
		return m;
	}
}
