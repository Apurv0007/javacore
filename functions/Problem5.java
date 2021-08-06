//WAP to display the sum of 1st 10 numbers no parameter and return value
package functions;

public class Problem5 {

	public static void main(String[] args) {
		int s ;
		s=sum_of_number();
		System.out.println("sum of 1st 10 number is "+s);
		}
	static int sum_of_number(){
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		return sum;
	}

}
