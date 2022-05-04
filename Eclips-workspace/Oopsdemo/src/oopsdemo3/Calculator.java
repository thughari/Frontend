package oopsdemo3;
//Program to understand concept of Interface
import java.util.Scanner;

public class Calculator implements IMath {

	Scanner kb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
	       
        c1.display();
        c1.add();
        c1.sub();
        c1.div();
        c1.mul();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);
		
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("SUbtraction of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Div of "+a+" and "+b+" is "+s);
		
	}
	
	void display()
    {
        System.out.println("My Calculator - Designed by Hari");
    }

}
