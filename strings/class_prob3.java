//String replace
package strings;

import java.util.Scanner;

class Stringreplace{
	String str;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		System.out.println("String before replace :"+str);
		System.out.println("String after replace :"+str.replace('e', 'a') );
	}
	
}

public class class_prob3 {

	public static void main(String[] args) {
		Stringreplace ob=new Stringreplace();
		ob.get();

	}

}
