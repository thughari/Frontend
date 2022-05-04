package exceptionsdemo;

import java.io.IOException;

public class ThrowsExample {

	void myMethod(int a) throws IOException,ArithmeticException
    {
        if(a==1)
            throw new IOException("IO Exception Ocurred");
        else
            throw new ArithmeticException("Arithmetic Exception");
    }
	
	public static void main(String[] args) {
		ThrowsExample T= new ThrowsExample();
		
		try {
			T.myMethod(1);
		}
		catch (Exception e) {
			System.err.println(e);
		}

	}

}
