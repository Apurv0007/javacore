// INPUT ->Raja Ram Mohan Rai 


// OUTPUT ->R.R.M.Rai 
package strings;

import java.util.Scanner;

class name_short{
	void getinfo() {
		String str;
		Scanner c=new Scanner(System.in);
		System.out.print("Enter the user name:");
		str=c.nextLine();
		String words[]=str.split("\\s");
		
		System.out.print("Your Short name:");
		for(int i=0;i<words.length-1;i++)
		{
		System.out.print(words[i].charAt(0)+".");
		}
		System.out.print(words[words.length-1]);
		}
	   }
        public class Problem8 {
        public static void main(String[] args) {
		name_short ob=new name_short();
		ob.getinfo();
        }
       }