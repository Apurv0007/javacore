// WAP display even no between 100 to 70
package recursion;

public class Problem6 {

	public static void main(String[] args) {
		disp(100);
}
	static void disp(int i) {
		if(i >=70) {
			if(i%2==0) {
				System.out.println(i+ " ");
			}
			disp(i-1);
		}
	}

}
