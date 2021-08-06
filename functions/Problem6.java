//WAP to display the sum of odd numbers between 1 to 30 no parameter and return value
package functions;

public class Problem6 {

	public static void main(String[] args) {
		int s;
		s=sum_of_odd();
		System.out.println("sum of odd between 1 to 30 is : "+s);
		
	}
	static int sum_of_odd() {
		int sum=0;
		for(int i=1;i<=30;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
