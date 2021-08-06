//WAP accept a string from user and display largest word.
package strings;

import java.util.Scanner;

class large{
	String str,longword=" ";
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		String word[]=str.split("\\s");
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>longword.length()) {
				longword=word[i];
			}
		}
		System.out.println("longest wor in the string is :" +longword+"\n its length is     :"+longword.length());
	}
}

public class Problem10 {

	public static void main(String[] args) {
	large ob=new large();
	ob.get();

	}

}
