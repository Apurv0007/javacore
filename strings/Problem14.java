// WAP accept a string from user and display only start with vowel
package strings;

import java.util.Scanner;

class vowels{
	String st1,st2="";
	 int i,l;
	 int ch;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		st1=sc.nextLine();
		System.out.println("String is :"+st1);
		String word[]=st1.split(" ");
		for(int i=0;i<word.length;i++) {
			ch=word[i].charAt(0);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				st2=st2+" "+word[i];
			
				}
		}
		System.out.println("new string is:"+st2);
			}
			}
public class Problem14 {

	public static void main(String[] args) {
		vowels ob=new vowels();
		ob.get();

	}

}
