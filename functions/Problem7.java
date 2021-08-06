////WAP to display the sum of even numbers between 100 to 70 no parameter and return value......
package functions;

public class Problem7 {

	public static void main(String[] args) {
		int s;
		s=sum_of_even();
		System.out.println("sum of even between 100 to 70 is :"+s);
}
	static int sum_of_even() {
		int sum=0;
		for(int i=100;i>=70;i--) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
