//table of any number;
package recursion;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		table(n,1);
		}
	static void table(int n,int i) {
		if(i<=10) {
			System.out.println(n+"x"+i+"="+n*i);
			table(n,i+1);
				
			
		}
	}

}
