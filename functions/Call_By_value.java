package functions;

import java.util.Scanner;

public class Call_By_value {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the value of a and b");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("value before a function :"+a);
	System.out.println("value before b function :"+b);
	disp(a,b);
	System.out.println("value  a after function :"+a);
	System.out.println("value  b after function :"+b);
	}
	static void disp(int a,int b) {
		a=a+10;
		b=b+10;
		System.out.println("value of a inside function :"+a);
		System.out.println("value of b inside function :"+b);
	}

}
