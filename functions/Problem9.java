//WAP count the palindrome  number betweenn101 to 200; no parameter and return.........
package functions;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args)
	{
		int c;
		c=count_palindrome_no();
				System.out.println("no of palindrome nuber between 101 to 200 is  :"+c);

	}
	static int count_palindrome_no() {
		
			int d=0,n,p=0,sum=0;
			for(int i=101;i<=200;i++) {
				n=i;
				while(n>0)
				{
				d=n%10;
				sum=sum*10+d;
				n=n/10;
			}
				if(i==sum) 
				{
					p++;
				}
				sum=0;
			}
		return p;
		}
}
