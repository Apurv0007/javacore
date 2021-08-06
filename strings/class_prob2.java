//                 .....................(REVERSE STRING PROBLEM).....................

package strings;

import java.util.Scanner;

class aa16{
	String st1,st2="",st3="";
	int i,l;
	char ch;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		st1=sc.nextLine();
		System.out.println("String is :"+st1);
		l=st1.length();
		System.out.println("Length of string :"+l);
		for(i=0;i<l;i++) {
			ch=st1.charAt(i);
			st2=st2+ch;
			st3=ch+st3;
		}
		System.out.println("value of st2    :"+st2);
		System.out.println("value of st3    :"+st3);
	}
}

public class class_prob2 {

	public static void main(String[] args) {
		aa16 ob=new aa16();
		ob.getdata();
		

	}

}
