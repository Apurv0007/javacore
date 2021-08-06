//WAP count the prime number betweenn1 to 100;no parameter and return.........
package functions;

public class Problem8 {

	public static void main(String[] args) {
		int r;
		r=count_prime_no();
		System.out.println("prime ni between 1 to 100 is :"+r);

	}
	static int count_prime_no() {
		int c=0,p=0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				p++;
			}
			c=0;
		}
		return p;
		
	}

}
