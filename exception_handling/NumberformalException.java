package exception_handling;

public class NumberformalException {

	public static void main(String[] args) {
		int i,l,val=0,inv=0,num;
		l=args.length;
		for(i=0;i<l;i++)
		{
			try
			{
				num=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e1) 
			{
				System.out.println("Invalid number :"+args[i]);
				inv=inv+1;
				continue;
			}
			val=val+1;
		}
		System.out.println("Total invalid number :"+inv);
		System.out.println("Total valid number :"+val);
		

	}

}
