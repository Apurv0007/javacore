//WAP accept a string from user and display 1st character in every word in capital.
package strings;

import java.util.Scanner;

class capital{
	String st1,st2="";
	int i,l;
	char ch;
        void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		st1=sc.nextLine();
		System.out.println("String is :"+st1);
		l=st1.length();
		for(int i=0;i<l;i++) {
			ch=st1.charAt(i);
			if(i==0) {
				ch=Character.toUpperCase(ch);
				st2=st2+ch;
			}
			else if(ch==' ') {
				ch=st1.charAt(i+1);
				ch=Character.toUpperCase(ch);
				st2=st2+" "+ch;
				i++;
				
			}
			else {
				st2=st2+ch;
			}
		}
		System.out.println("String after conversion : "+st2);
		
		
	
		
	}
}

public class Problem13 {

	public static void main(String[] args) {
	capital ob=new capital();
	ob.get();

	}

}
