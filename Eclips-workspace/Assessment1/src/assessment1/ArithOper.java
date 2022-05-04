package assessment1;

import java.util.*;

public class ArithOper {

	public static void main(String[] hari) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("enter the first value : ");
		a=sc.nextInt();
		System.out.print("enter thye second value : ");
		b=sc.nextInt();
		System.out.println("the sum of 2 numbers is : "+(a+b));
		System.out.println("the product of 2 numbers is : "+(a*b));
		System.out.println("the division of 2 numbers is : "+((float)a/b));
		System.out.println("the dofference of 2 nuymbers is : "+Math.abs(a-b));
		sc.close();
	}

}
