// input->123
// output->one two three
package strings;

import java.util.Scanner;

class num_to_word{
	String st1=" ";
	int n,d;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>0) {
			d=n%10;
			switch(d) {
			case 0:
				st1="Zero "+st1;
				break;
			case 01:
				st1="One "+st1;
				break;
			case 2:
				st1="Two "+st1;
				break;
			case 3:
				st1="three "+st1;
				break;
			case 4:
				st1="Four "+st1;
				break;
			case 5:
				st1="Five "+st1;
				break;
			case 6:
				st1="Six "+st1;
				break;
			case 7:
				st1="Seven "+st1;
				break;
			case 8:
				st1="Eight "+st1;
				break;
			case 9:
				st1="Nine "+st1;
				break;
				
			}
			n=n/10;
		}
		System.out.println("Number in words : " +st1);
	}
}

public class Problem9 {

	public static void main(String[] args) {
		num_to_word
		ob=new num_to_word();
		ob.get();
		
	}

}
