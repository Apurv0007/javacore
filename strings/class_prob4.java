//equala ,compare
package strings;

import java.util.Scanner;

class equals{
	String st1,st2;
	void getinfo() {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String in lower case");
	st1=sc.nextLine();
	System.out.println("Enter the same String in Upper case");
	st2=sc.nextLine();
	System.out.println("Enter any String in lower case :"+st1);
	System.out.println("Enter the same String in Upper case :"+st2);
	System.out.println("Both Strings are equal :"+st1.equals(st2));
	System.out.println("String are equal by ignoring case :"+st1.equalsIgnoreCase(st2));
	System.out.println("com bet both String :"+st1.compareTo(st2));
	System.out.println("com bet both by ignoreing case :"+st1.compareToIgnoreCase(st2));
	
	}
	}

public class class_prob4 {
	public static void main(String[] args) {
	equals ob =new equals();
    ob.getinfo();
	}

}
