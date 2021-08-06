
package recursion;

public class problem1 {

	public static void main(String[] args) {
	disp(1);

	}
	static void disp(int i) {
		if(i<=10) {
			System.out.println(i);
			disp(i+1);
		}
	}

}
