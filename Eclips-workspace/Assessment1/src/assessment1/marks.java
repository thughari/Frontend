package assessment1;
import java.util.Scanner;

public class marks {

	public static void main(String[] hari) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the marks of first subject : ");
		int a=sc.nextInt();
		System.out.print("enter the marks of second subject : ");
		int b=sc.nextInt();
		System.out.print("enter the marks of third subject : ");
		int c=sc.nextInt();
		System.out.println("the total marks are : "+ (a+b+c));
		System.out.printf("the percentage is : %.2f%%",(float)(a+b+c)/300*100);
		sc.close();

	}

}
