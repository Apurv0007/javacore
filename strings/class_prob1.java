package strings;

import java.util.Scanner;

class aa15{
	String fn,ln,name;
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		fn=sc.nextLine();
		System.out.println("Enter the last name");
		ln=sc.nextLine();
		System.out.println("first name    : "+fn);
		System.out.println("last name     : "+ln);
		//name=fn+" "+ln;
		//System.out.println("name     : "+name);
		         //OR
		name=fn.concat(" ").concat(ln);
		System.out.println("name is       : "+name);
	}
}

public class class_prob1 {

	public static void main(String[] args) {
           aa15 ob=new aa15();
           ob.getinfo();

	}

}
