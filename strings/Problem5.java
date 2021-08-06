//WAP accept a string from user and replace every blank space with ‘$'
package strings;

import java.util.Scanner;

class replace{
	String str;
	void getinfo() {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		str=sc.nextLine();
		System.out.println("String is :"+str);
		System.out.println(str.replace(' ', '$'));
	}
}

public class Problem5 {

	public static void main(String[] args) {
		replace ob=new replace();
		ob.getinfo();
	}

}
