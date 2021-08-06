//WAP display odd number between 1 to 30
package recursion;

public class Problem4 {

	public static void main(String[] args) {
	 disp(1);
}
	static void disp(int i) {
		if(i<30) {
		if(i%2==1) {
			System.out.println(i+" ");
		}
		disp(i+1);
		}
	}
		
	}


