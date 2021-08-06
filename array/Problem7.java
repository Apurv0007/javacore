//WAP that takes 10 roll no.and 10 marks from user and enter roll no.and display the respective no.
package array;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int roll[]=new int[100];
	int marks[]=new int[100];
	int s,i,rn,c=0;
	System.out.println("enter how many records......");
	s=sc.nextInt();
	for(i=0;i<s;i++) {
		System.out.println("Enter roll no.");
		roll[i]=sc.nextInt();
		System.out.println("enter marks");
		marks[i]=sc.nextInt();
	
	}
	System.out.println("--------------------");
	System.out.println("\t\tstudent details");
	System.out.println("--------------------");
	for(i=0;i<s;i++) {
		System.out.println(roll[i]+"\t\t"+marks[i]);
	}
	System.out.println("--------------------");
	System.out.println("enter the the roll no.  want to be serch");
	rn=sc.nextInt();
for(i=0;i<s;i++) {
	if(roll[i]==rn) {
		c++;
		System.out.println("marks          :"+marks[i]);
	}
}
  if(c==0) {
	  System.out.println("roll no. not found");
  }
       
  	
    }
    	
    	
	}
	


