//No parameter and return value
package functions;

public class class_problem1 {

	public static void main(String[] args) {
		 int r;
		 r=sum_of_10_no();//function call with no parmeter
		 System.out.println("sum of ten no. "+r);
	}

	static int sum_of_10_no()
	{
		int s=0;
		for(int i1=1;i1<=10;i1++) {
			System.out.println(i1);
			s=s+i1;
		}
		return s;
	}
}
