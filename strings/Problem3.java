//WAP accept a string from user and display in reverse order
package strings;

import java.util.Scanner;

class reverse_oreder{
	String str;
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string  ");
		 str=sc.nextLine();
		 String string = str;
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);

	}
	
}


public class Problem3 {

	public static void main(String[] args) {
		reverse_oreder ob=new reverse_oreder();
		ob.getinfo();
	}

}
