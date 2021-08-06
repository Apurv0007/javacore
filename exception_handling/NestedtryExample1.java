package exception_handling;

public class NestedtryExample1 {

	public static void main(String[] args) {
		try {
			int a=args.length;
			int b=42/a;
			System.out.println("a="+a);
			try{
				if(a==1)
					a=a/(a-a);
				if(a==2) {
					int c[]= {1};
					c[42]=99;
				}
			}catch(ArrayIndexOutOfBoundsException e1) 
			{
				System.out.println("Array index out-of-bond :"+e1);
			}
			}
			catch(ArithmeticException e2) {
				System.out.println("Divide by 0 :"+e2);
			}
			
		
		
		
	}

}
