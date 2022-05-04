package assessment1;
import java.util.Scanner;

public class areaOfRect {

	public static void main(String[] hari) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double l,b;
		System.out.print("enter length of rectangle : ");
		l=sc.nextDouble();
		System.out.print("enter breadth of rectangle :");
		b=sc.nextDouble();
		System.out.println("the area of rectangle casted into int is :"+(int)(l*b));
		sc.close();
	}

}
