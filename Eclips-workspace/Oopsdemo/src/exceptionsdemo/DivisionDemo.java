package exceptionsdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integers ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try {
			c=a/b;
			System.out.println("division is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("zero division occured");
			System.out.println("Exception Description "+e.getMessage());
			System.out.println("Exception name and Description "+e.toString());
			e.printStackTrace();
		}
		finally {
			System.out.println("final block is execued");
		}

	}

}
