package assessment1;
import java.util.*;

public class findMaxOfThree {

	public static void main(String[] hari) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("enter the first value: ");
		a=sc.nextInt();
		System.out.print("enter the second value: ");
		b=sc.nextInt();
		System.out.print("enter the third value: ");
		c=sc.nextInt();
		sc.close();
		System.out.println("the sum of three numbers is :"+a+b+c);
		System.out.println("the average of three numbers is :"+((float)a+b+c)/3);
		System.out.println("the product of three numbers is :"+a*b*c);
		System.out.println("the largest number is "+Math.max(a,Math.max(b, c)));
		System.out.println("the smallest number is "+Math.min(a,Math.min(b, c)));
		
	}

}
