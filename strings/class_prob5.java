//Upper case and Lower case.
package strings;

import java.util.Scanner;

class cases{
	/*String st1;
	int i,l,ac;                      
	char ch;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		st1=sc.nextLine();
		System.out.println("String is   :"+st1);
		System.out.println("String after conversion is");
		for(i=0;i<st1.length();i++) {
			ch=st1.charAt(i);
			ac=ch;//Type casting
			if(ac>=65&&ac<=90) {
				System.out.print((char)+(ac+32));
			}
			else if(ac>=97&&ac<=122) {
				System.out.print((char)+(ac-32));
			}
			else {
				System.out.println((char)ac);
			}
		}*/
	
	/* Now using functions */
	
	String st1,st2,st3;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String with lower case");
		st1=sc.nextLine();
		System.out.println("Enter the String with Upper case");
		st2=sc.nextLine();
		System.out.println("Enter the String with space");
		st3=sc.nextLine();
		System.out.println("String in Lower case :"+st1);
		System.out.println("String after conversion :"+st1.toUpperCase());
		System.out.println("String in Upper case :"+st2);
		System.out.println("String after conversion :"+st2.toLowerCase());
		System.out.println("String with space     :"+st3+":");
		System.out.println("String after trim     :"+st3.trim()+":");
		
	}
	
}

public class class_prob5 {

	public static void main(String[] args) {
		cases ob=new cases();
		ob.get();

	}

}
