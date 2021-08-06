//WAP accept the distance in meter and convert it in Kilometer........(Parameter and return)
package functions;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the distance in meter");
		double n=sc.nextDouble();
		double m;
		m=distance_in_km(n);
		System.out.println("distance in kilometer ->"+m);
		}
	static double distance_in_km(double n) {
		double km ;
		
		km=n/1000;
		
		return km;
	}
	

}
