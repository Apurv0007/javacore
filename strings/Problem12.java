// String Shorting
package strings;

import java.util.Scanner;

class shorting{
	
      String temp;
      int i,j;
	void get() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 10 names :");
		String name[]=new String[10];
		
		for( i=0;i<10;i++) 
		{
			name[i]=sc.nextLine();
		}
			System.out.println("\n----------------------------");
			System.out.println("10 name are :");
			for(i=0;i<10;i++) 
			{
				System.out.println(name[i]);
				}
			for( i=0;i<9;i++) {
				for( j=i+1;j<10;j++) {
					if(name[i].compareTo(name[j])>0) {
						temp=name[i];
						name[i]=name[j];
						name[j]=temp;
					}
						
				}
			}
			System.out.println("\n----------------------------");
			System.out.println("name after shorting :");
			for (i=0;i<10;i++)
				System.out.println(name[i]);
		}
		
		}
	


public class Problem12 {

	public static void main(String[] args) {
		shorting ob=new shorting();
		ob.get();

	}

}
