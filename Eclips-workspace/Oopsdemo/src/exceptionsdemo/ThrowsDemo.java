package exceptionsdemo;

public class ThrowsDemo {
	
	void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
     
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
     
    }

	public static void main(String[] args) {
		ThrowsDemo T= new ThrowsDemo();
		try {
			T.Division();
		}
		catch (ArithmeticException e) {
			System.err.println("\n\tError : "+e.getMessage());
		}
		System.out.println("\n\tEnd of program");

	}

}
