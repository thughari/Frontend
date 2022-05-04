package exceptionsdemo;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a : ");
		a=sc.nextInt();
		System.out.println("Enter b : ");
		b=sc.nextInt();
		result=a/b;
		System.out.println(result);

	}

}
