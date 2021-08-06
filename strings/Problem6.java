/*&WAP accept a string from user 


input LIKE- > india is my country .
output     -> aidni si ym yrtnuoc .
*/
package strings;

import java.util.Arrays;


import java.util.Scanner;

class reverse_word{
	String str,reversedString="";
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Original string :");
		str=sc.nextLine();
		String words[]=str.split(" ");

		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
				
			}
			reversedString=reversedString+reverseWord+" ";
		}
		System.out.println("reversed String :"+reversedString);
	}
     
	
	}


public class Problem6 {

	public static void main(String[] args) {
		reverse_word ob=new reverse_word();
		ob.getinfo();

	}

}
