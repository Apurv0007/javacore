// Input->Fun is Computer 

//Output->Computer is Fun
package strings;

import java.util.Scanner;

class sentance_reverse{
	String str,reversedString=" ";
	void getInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("original word :");
		str=sc.nextLine();
		System.out.println("INPUT   :"+str);
		String words[]=str.split("\\s");
		for(int i=0;i<words.length;i++) {
			if(i==words.length-1)
				reversedString=words[i]+reversedString;
			
			else
				
				reversedString=" "+words[i]+reversedString;
			
		}
		System.out.println("OUTPUT :"+reversedString);
	}
}

public class Problem7 {

	public static void main(String[] args) {
		
		sentance_reverse ob=new sentance_reverse();
		ob.getInfo();
	}

}
