// WAP accept a string from user and count how many space in string 
package strings;

import java.util.Scanner;

class count_space{
	String string;
	int c=0;
	void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		string=sc.nextLine();
		System.out.println("String :->"+string);
		System.out.println("String length :->"+string.length());
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==' ') 
			{
				c++;
			}
			}
		System.out.println("sapce between the string :->"+c);
			}
}
     public class Problem1 {
     public static void main(String[] args) {
		count_space ob=new count_space();
		ob.getinfo();
		}

}
