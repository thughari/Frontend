import java.util.Scanner;

/*Write a program to print the area of a rectangle by creating a class named Area taking the
values of its length and breadth as parameters of its method and having a method named
returnArea which returns the area of the rectangle. Length and breadth of rectangle are
entered through keyboard.*/
public class Area {

	private double length;
	private double breadth;
	
	public double returnArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter lenght : ");
		length=sc.nextDouble();
		System.out.print("enter breadth : ");
		breadth=sc.nextDouble();
		return length*breadth;
	}
		
}

