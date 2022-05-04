package assessment1;
import java.util.Scanner;

public class isMultiple {

	public static void main(String[] hari) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number :");
		int a=sc.nextInt();
		System.out.print("enter the second number :");
		int b=sc.nextInt();
		int r=b%a;
		if(r==0)
			System.out.println("it is divisible");
		else
			System.out.println("it is not divisible");
		sc.close();
	}

}
