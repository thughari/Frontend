package exceptionsdemo;

public class ThrowDemo {
	public static void hello(int a)
    {
        if(a==0)
        	throw new ArithmeticException("Testing User Defined Exception");       // exception thrown manually
        else
            System.out.println(a);
    }

	public static void main(String[] args) {

		hello(100);
        hello(0);

	}

}
