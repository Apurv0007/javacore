//WAP count the prime number 1 to 100(NO PARAMETER AND RETURN VALUE)
package opps;
class prime2{
	int n,c=0,p=0;
	int calc() {
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
		System.out.println("prime number between 1 to 100 :"+p);
		return p;
	}
}

public class Problem9 {

	public static void main(String[] args) {
		prime2 ob=new prime2();
		ob.calc();
		

	}

}
