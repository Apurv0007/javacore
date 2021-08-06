//WAP accept a string from user and count how many vowel present in string
package strings;

import java.util.Scanner;

class Find_vowel{ 
	String st1; 
	char ch;
	int v=0;
	
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		st1=sc.nextLine();
		System.out.println();
		System.out.println("String is :"+st1);
		int l=st1.length();
		for(int i=0;i<l;i++) {
			ch=st1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			}
		}
		System.out.println("No. of vowels :"+v);
		
	}
}

public class Problem4 {

	public static void main(String[] args) {
		Find_vowel ob=new Find_vowel();
		ob.getinfo();

	}

}
