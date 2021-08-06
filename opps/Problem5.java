//WAP accept the number from user and display  weather the number is perfect or not.(NO PARAMETER AND NO RETURN)
package opps;

import java.util.Scanner;

class perfect{
	int n,sum=0;
	void disp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
	}
	void calc() {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
		System.out.println("number is perfect");
		}
		else 
			System.out.println("not perfect");
	}
}

public class Problem5 {

	public static void main(String[] args) {
	perfect ob =new perfect();
	ob.disp();
	ob.calc();

	}

}
