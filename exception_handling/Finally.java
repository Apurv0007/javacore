package exception_handling;

public class Finally {
	static void procA(){
		try {
			System.out.println("inside procAa");
			throw new RuntimeException("demo");
		}
		finally {
			System.out.println("procAa's finally");
		}
	}
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		}
		finally {
			System.out.println("procB's finally");
		}
	}
	static void procC() {
		try {
			System.out.println("inside proC");
		}
		finally {
			System.out.println("procC's finally");
		}
		
	}

	public static void main(String[] args) {
		try {
			procA();
		}
		catch (Exception e) {
			System.out.println("Exceptipon caught");
		}
		procB();
		procC();
	

	}

}
