//WAP accept String from user and check weather it is  palindrome or not.
package strings;

import java.util.Scanner;

class palindrome{
	String st1,st2="";
	char ch;
	
	
	void get() {
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter any String");
	      st1=sc.nextLine();
	      System.out.println(" String is :"+st1);
	      for(int i=0;i<st1.length();i++) {
	    	  ch=st1.charAt(i);
	    	  st2=ch+st2;
	      }
	      System.out.println("reverse string is :"+st2);
	      if(st1.equals(st2)) {
	    	  System.out.println("String is palindrome");
	      }
	      else{
	    	  System.out.println("not palindrome");
	      }
	      }    
}

public class Problem11 {

	public static void main(String[] args) {
		palindrome ob=new palindrome();
		ob.get();

	}

}
