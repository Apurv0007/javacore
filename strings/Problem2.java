// WAP accept a string from user and count how many word present in string
package strings;

import java.util.Scanner;

class count_word{
	String str;
	int c=0;
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				c++;
			}
		}
		System.out.println("word present in string "+(c+1));
	}
}

public class Problem2 {
	public static void main(String[] args) {
		count_word ob=new count_word();
		ob.getinfo();

	}
}
