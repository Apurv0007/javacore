//WAP that takes 10 no. from user and display max no. and min no.
package array;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arary");
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++) {
       	 System.out.print("arr["+i+"]=");
       	 num[i]=sc.nextInt();
        }
        int max=num[0];
        int min=num[0];
        System.out.println("array elements are");
        for(int i=0;i<n;i++) {
       	 System.out.println(num[i]);
       	 if(num[i]>max);
       	 {
       		 max=num[i];
       	 }
       	 if(num[i]<min) {
       		 min=num[i];
       	 }
        }
        System.out.println("max no      :"+max);
        System.out.println("min no      :"+min);
	}

}
