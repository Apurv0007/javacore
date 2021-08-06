package exception_handling;

public class Throw {
	static void dempproc() {
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e) {
			System.out.println("caught inside demoproc");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			dempproc();
			
		}catch(NullPointerException e)
		{
			System.out.println("Recaught :"+e);
		}

	}

}
