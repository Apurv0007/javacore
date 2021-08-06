//WAP accept three digit number from user and display the sum of digit. eg.(123->1+2+3=6)(PARAMETER AND RETURN)
package opps;



class digit_sum{
	int n,sum=0,d=0;
	
	int cal(int n) {
		
		while(n>0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
       
		return sum;
	}
}

public class Problem11 {

	public static void main(String[] args) {
		digit_sum ob=new digit_sum();
	
		
		System.out.println("sum of digits :"+ob.cal(456));
		
	

	}

}
