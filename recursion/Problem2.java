//Table of 2
package recursion;

public class Problem2 {

	public static void main(String[] args) {
		table(1);
		}
	static void table(int i) {
		if(i<=10) {
			System.out.println(i*2);
			table(i+1);
		}
	}

}
